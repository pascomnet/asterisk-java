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
package org.asteriskjava.manager.action;

import org.asteriskjava.manager.event.ContactListCompleteEvent;
import org.asteriskjava.manager.event.ResponseEvent;

/**
 * Retrieves a list of all defined contacts.
 * <p>
 * For each Contact a ContactListEvent is raised that contains relevant attributes and status information.
 * Once all contacts have been listed a ContactListCompleteEvent is issued.
 * <p>
 *
 * @author Stefan Tosic
 * @version $Id$
 * @see org.asteriskjava.manager.event.ContactListEvent
 * @see org.asteriskjava.manager.event.ContactListCompleteEvent
 */
public class PJSipShowContactsAction extends AbstractManagerAction implements EventGeneratingAction
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 889440154275360382L;

    /**
     * Creates a new PJSipShowContactsAction.
     */
    public PJSipShowContactsAction()
    {

    }

    @Override
    public String getAction()
    {
        return "PJSIPShowContacts";
    }

    public Class< ? extends ResponseEvent> getActionCompleteEventClass()
    {
        return ContactListCompleteEvent.class;
    }
}
