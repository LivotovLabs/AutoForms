package eu.livotov.labs.vaadin.autoforms.ann;

import eu.livotov.labs.vaadin.autoforms.api.FormFieldType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * (c) Livotov Labs Ltd. 2012
 * Date: 02.09.12
 *
 * Placeholders, allowed in string attributes:
 *
 * #field - name of the corresponding bean field, this annotation is bound to
 * @{fieldName} - value of the specified bean field, for instance: @name, @address, @zipCode. If specified field is
 * a class itself, you can specify nested properties via "." separator: @address.city , etc... If not specified,
 * nested class toString method value will be used.
 * ${keyName} - translated string from TPT i18n dictionary, for instance: $title, $ok, $cancel,
 * etc... If no TPT is present in a classpath, the same source string is returned.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FormField
{

    public abstract String title() default "#field";
    public abstract String hint() default "";
    public abstract String description() default "";
    public abstract boolean required() default false;
    public abstract boolean visible() default true;
    public abstract boolean autocomplete() default true;
    public abstract String datasourceField() default "";
    public abstract String autocompleteDatasourceName() default "";
    public abstract String position() default "";
    public abstract FormFieldType type() default FormFieldType.Auto;
    public abstract double min() default Double.MIN_VALUE;
    public abstract double max() default Double.MAX_VALUE;
    public abstract String allowedCharacters() default "";
    public abstract String validationRegexp() default "";
    public abstract String validationError() default "";
    public abstract String emptyError() default "";


}
