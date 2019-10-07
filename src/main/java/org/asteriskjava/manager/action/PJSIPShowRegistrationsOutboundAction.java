package org.asteriskjava.manager.action;

import org.asteriskjava.manager.event.OutboundRegistrationDetailCompleteEvent;
import org.asteriskjava.manager.event.ResponseEvent;

/**
 * Lists PJSIP outbound registrations
 * <p>
 * For each outbound registration configuration and status information are received
 * Once all events have been listed a OutboundRegistrationDetailCompleteEvent is issued.
 * <p>
 *
 * @author Stefan Tosic
 * @version $Id$
 * @see org.asteriskjava.manager.event.OutboundRegistrationDetailEvent
 * @see org.asteriskjava.manager.event.AuthDetailEvent
 * @see org.asteriskjava.manager.event.OutboundRegistrationDetailCompleteEvent
 */
public class PJSIPShowRegistrationsOutboundAction extends AbstractManagerAction implements EventGeneratingAction {


	/**
	 * Serial version identifier.
	 */
	private static final long serialVersionUID = -3074317632738376769L;

	/**
	 * Creates a new PJSIPShowRegistrationsOutboundAction.
	 */
	public PJSIPShowRegistrationsOutboundAction() {

	}

	@Override
	public String getAction() {
		return "PJSIPShowRegistrationsOutbound";
	}

	public Class<? extends ResponseEvent> getActionCompleteEventClass() {
		return OutboundRegistrationDetailCompleteEvent.class;
	}
}
