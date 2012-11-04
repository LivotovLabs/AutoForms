package eu.livotov.labs.vaadin.autoforms.ann;

import eu.livotov.labs.vaadin.autoforms.api.Autocompleter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * (c) Livotov Labs Ltd. 2012
 * Date: 02.09.12
 *
 * Marks a field as a datasource for other field. Must only be applied to collection, containing dataset to be
 * present as choice values for other fields.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AutocompleteDatasource
{

    Class autocompleter();
    boolean matchAnywhere() default true;
    boolean ignoreCase() default true;
    String choicesListDisplayField();

}
