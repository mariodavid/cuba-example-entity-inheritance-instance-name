## CUBA example - entity inheritance with instance name

This example shows how to use entity inheritance and reference the inheritance chain from another entity.

### Example domain model

* Pet -N--1-> Owner
* Person extends Owner
* Company extends Owner
* Person -1--1-> User

### Instance Names

* Person: `@NamePattern("%s|user")`
* Company: `@NamePattern("%s|name")`


### Problem

Currently the problem is, that the view inheritance does not seem to work. In particular the attributes of the
inherited entities are not loaded correctly, which leads to the problem then when showing them in the instance name
the attributes cannot be fetched.

The application behalves like this:

![Overview](https://github.com/mariodavid/cuba-example-entity-inheritance-instance-name/blob/master/img/overview.gif)


The view's definition looks like this:


#### View definition

```xml
<views xmlns="http://schemas.haulmont.com/cuba/view.xsd">

    <view entity="ceeiin_Pet" name="pet-view" extends="_local">
        <property name="owner" view="owner-view"/>
    </view>




    <!-- Owner View (inheritance top) - to be overriden -->
    <view entity="ceeiin_Owner" name="owner-view" extends="_local"/>


    <!-- Person View (extends owner-view), includes user reference -->
    <view entity="ceeiin_Person" name="owner-view" extends="_local" overwrite="true">
        <property name="user" view="_minimal"/>
    </view>

    <!-- Company View (extends owner-view), includes local attribute -->
    <view entity="ceeiin_Company" name="owner-view" extends="_local" overwrite="true"/>
</views>
```

#### Pet Editor

In  the pet editor it should be possible to select a particular owner (either a person or a company). The `pet-view` includes the owner
with the `owner-view`.

```xml
<data>
    <instance id="petDc"
              class="com.rtcab.ceeiin.entity.Pet"
              view="pet-view">
        <loader/>
    </instance>
</data>

<layout expand="editActions" spacing="true">
    <form id="form" dataContainer="petDc">
        <column width="250px">
            <textField id="nameField" property="name"/>
            <pickerField id="ownerField" property="owner">
                <actions>
                    <action id="lookup" type="picker_lookup"/>
                    <action id="clear" type="picker_clear"/>
                </actions>
            </pickerField>
        </column>
    </form>
</layout>
```

After selecting an owner via the picker field, an unfetched error exception is thrown:

```
IllegalStateException: Cannot get unfetched attribute [user] from detached object com.rtcab.ceeiin.entity.Person-7a491c17-d7a5-949a-864d-c999ad9c0ea4 [detached].
```


![unfetched-error-company](https://github.com/mariodavid/cuba-example-entity-inheritance-instance-name/blob/master/img/unfetched-error-company.png)

![unfetched-error-person](https://github.com/mariodavid/cuba-example-entity-inheritance-instance-name/blob/master/img/unfetched-error-person.png)


