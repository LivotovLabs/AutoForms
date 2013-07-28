package eu.livotov.labs.vaadin.autoforms.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FormBean
{

    String title() default "";
    String header() default "";
    String footer() default "";
    int rows() default 1;
    int columns() default 1;
    boolean commitButtonVisible() default true;
    boolean cancelButtonVisible() default true;
    String commitButtonTitle() default "";
    String cancelButtonTitle() default "";
}