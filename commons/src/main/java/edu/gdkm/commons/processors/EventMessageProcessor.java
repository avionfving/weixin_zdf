package edu.gdkm.commons.processors;

import edu.gdkm.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
	
}
