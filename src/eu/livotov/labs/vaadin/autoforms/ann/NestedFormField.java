package eu.livotov.labs.vaadin.autoforms.ann;

import eu.livotov.labs.vaadin.autoforms.api.FormFieldType;
import eu.livotov.labs.vaadin.autoforms.api.NestedFieldsExpandMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * (c) Livotov Labs Ltd. 2012
 * Date: 02.09.12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NestedFormField
{

    String title() default "#field";
    String hint() default "";
    String description() default "";
    boolean expandedByDefault() default false;
    NestedFieldsExpandMode expandMode() default NestedFieldsExpandMode.Inline;
    Class collapsedViewProvider();


}
