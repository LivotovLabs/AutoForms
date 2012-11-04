package eu.livotov.labs.vaadin.autoforms.api;

import java.util.Collection;

/**
 * (c) Livotov Labs Ltd. 2012
 * Date: 02.09.12
 */
public interface Autocompleter
{
    Collection<Object> autocomplete(String pattern, boolean matchAnywhere, boolean ignoreCase);
}
