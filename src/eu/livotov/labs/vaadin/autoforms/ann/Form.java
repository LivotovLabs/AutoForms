package eu.livotov.labs.vaadin.autoforms.ann;

import eu.livotov.labs.vaadin.autoforms.api.CommitControlsMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: dlivotov
 * Date: 02.09.12
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Form
{

    String title() default "";
    int rows() default 1;
    int columns() default 1;
    AutocompleteDatasource[] autocompleteDatasources();
    CommitControlsMode commitControlsMode() default CommitControlsMode.BottomRight;
    boolean commitControlVisible() default true;
    boolean cancelControlVisible() default true;
}
