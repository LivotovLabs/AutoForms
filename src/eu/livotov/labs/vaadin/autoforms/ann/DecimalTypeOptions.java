package eu.livotov.labs.vaadin.autoforms.ann;

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
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DecimalTypeOptions
{

    public abstract double min() default Double.MIN_VALUE;
    public abstract double max() default Double.MAX_VALUE;
    public abstract String validationMinimumErrorMessage() default "";
    public abstract String validationMaximumErrorMessage() default "";


}
