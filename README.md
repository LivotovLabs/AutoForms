Retirement Notice
=================
This project is retired and no longer maintained


AutoForms
=========

This pure server-side add-on goal is to let Vaadin developers build simple and complex forms almost instantly in their apps by
just annotating POJOs, representing the actual data. This makes the actual app source code more cleaner and smaller.

Form layout is build very like to desktop Java TableLayout component - provide layout table size (rows,cols) in @FormBean annotation
and set the occupied columns/rows for each field in @FormField annotation, parameter "location".

We're sorry, there are no documentation formed, please see the annotations objects as well as quick start sample below.
As soon as we finalize and freeze the 1.0 APIs, documentation will be added.


LICENSE
=======
AutoForms is absolutely free and uses version 2 of Apache License, please see LICENSE.TXT for more details.


Status
======

Current add-on status is experimental and in heavy development. All API's may change several times without any notice.
We'll appreciate any corrections, bugs, ideas and for sure - pull requests.

Hope to have this add-on released soon.


Usage
=====

1. Drop the autoforms.jar to your WEB-INF/lib folder. This is a server-side add-on and it does not require any widgetset changes.

2. Create any POJO, which will represent your form data and annotate its fields

3. Create new AutoForm object, add it to your layout, set the datasource and you're done !


Quick Start Sample
==================

Create POJO to represent your model
-----------------------------------

```java
@FormBean(rows = 4, columns = 2, cancelButtonVisible = false, commitButtonVisible = false, title = "Регистрация", header = "Мы не будем утомлять вас длинной регистрацией. Укажите как вас зовут, адрес электронной почты и придумайте пароль. Все остальные данные, такие как адреса доставки, контактные телефоны и прочее вы сможете заполнить в любое удобное время в личном кабинете.")
public class SignupForm implements Serializable
{

    @FormField(title = "Your name", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your name")
    private String name;

    @FormField(title = "E-Mail", location = "0,1,1,1", required = true, requiredFieldErrorMessage = "Please enter your e-mail")
    private String email = "a@b.c";

    @FormField(title = "Date of birth", location = "0,2,1,2", requiredFieldErrorMessage = "Please indicate your date of birth")
    @DateTypeOptions(resulution = Resolution.MONTH, format = "dd.MM.yyyy")
    private long birthDate;

    @FormField(title = "Create new password", location = "0,3", required = true, requiredFieldErrorMessage = "Please create and type your new password")
    private String password1;

    @FormField(title = "Type your password again", location = "1,3", required = true, requiredFieldErrorMessage = "Retype your password once again for verification")
    private String password2;

    public SignupForm()
    {
    }

    // getter and setters skipped...
}
```


Add form to  your layout
------------------------

```java
AutoForm form = new AutoForm();
myWindowLayout.addComponent(form);
```


Set data object to display the form
-----------------------------------

```java
SignupForm data = new SignupForm();
form.setFormData(data);
```


Get form data back
------------------

```java
form.commit();
form.getFormData();
```
