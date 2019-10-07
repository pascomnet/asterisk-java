package org.asteriskjava.manager.event;

/**
 * @author Stefan Tosic
 * @since 2019-10-07
 */
public class OutboundRegistrationDetailCompleteEvent extends ResponseEvent
{
	/**
	 * Serial version identifier.
	 */
	private static final long serialVersionUID = -8614746282824243230L;


	private Integer listItems;
	private String eventList;

	/**
	 * Creates a new instance.
	 *
	 * @param source
	 */
	public OutboundRegistrationDetailCompleteEvent(Object source)
	{
		super(source);
	}

	/**
	 * Returns the number of OutboundRegistrationDetailEvent that have been reported.
	 *
	 * @return the number of OutboundRegistrationDetailEvent that have been reported.
	 */
	public Integer getListItems()
	{
		return listItems;
	}

	/**
	 * Sets the number of OutboundRegistrationDetailEvent that have been reported.
	 *
	 * @param listItems the number of OutboundRegistrationDetailEvent that have been reported.
	 */
	public void setListItems(Integer listItems)
	{
		this.listItems = listItems;
	}

	/**
	 * Returns always "Complete".
	 *
	 * @return always returns "Complete" confirming that all OutboundRegistrationDetailEvent have
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
