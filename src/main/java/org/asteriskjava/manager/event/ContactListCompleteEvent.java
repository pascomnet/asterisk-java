/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

/**
 * A ContactListCompleteEvent is triggered after the details of all contacts has been
 * reported in response to an PJSipShowContactsAction.
 * <p>
 * Available since Asterisk 16
 *
 * @see org.asteriskjava.manager.event.ContactListEvent
 * @see org.asteriskjava.manager.action.PJSipShowContactsAction
 * @author Stefan Tosic
 * @version $Id$
 */
public class ContactListCompleteEvent extends ResponseEvent
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = -308250379505175949L;

    private Integer listItems;
    private String eventList;

    /**
     * Creates a new instance.
     *
     * @param source
     */
    public ContactListCompleteEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the number of ContactListEvents that have been reported.
     *
     * @return the number of ContactListEvents that have been reported.
     */
    public Integer getListItems()
    {
        return listItems;
    }

    /**
     * Sets the number of ContactListEvents that have been reported.
     *
     * @param listItems the number of ContactListEvents that have been reported.
     */
    public void setListItems(Integer listItems)
    {
        this.listItems = listItems;
    }

    /**
     * Returns always "Complete".
     *
     * @return always returns "Complete" confirming that all ContactListEvents have
     *         been sent.
     * @since 1.0.0
     */
    public String getEventList()
    {
        return eventList;
    }

    public void setEventList(String eventList)
    {
        this.eventList = eventList;
    }
}
