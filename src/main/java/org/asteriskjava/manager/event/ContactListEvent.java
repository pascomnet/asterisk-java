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
 * A ContactListEvent is triggered in response to a
 * {@link org.asteriskjava.manager.action.PJSipShowContactsAction}
 * and contains information about a PJSIP contact
 * <p>
 * Available since Asterisk 16
 *
 * @author Stefan Tosic
 * @version $Id$
 * @see org.asteriskjava.manager.event.ContactListCompleteEvent
 * @see org.asteriskjava.manager.action.PJSipShowContactsAction
 */
public class ContactListEvent extends ResponseEvent {

	/**
	 * Serial version identifier.
	 */
	private static final long serialVersionUID = 151278936237115123L;

	public static final String STATUS_REACHABLE = "Reachable";
	public static final String STATUS_UNREACHABLE = "Unreachable";
	public static final String STATUS_NON_QUALIFIED = "NonQualified";
	public static final String STATUS_UNKNOWN = "Unknown";

	private String objectType;
	private String objectName;
	private String viaAddr;
	private Integer viaPort;
	private Double qualifyTimeout;
	private String callId;
	private String regServer;
	private Boolean pruneOnBoot;
	private String path;
	private String endpoint;
	private Boolean authenticateQualify;
	private String uri;
	private String qualifyFrequency;
	private String userAgent;
	private String expirationTime;
	private String outboundProxy;
	private String status;
	private Long roundtripUsec;

	/**
	 * Creates a new instance.
	 *
	 * @param source
	 */
	public ContactListEvent(Object source) {
		super(source);
	}

	/**
	 * @return object type, always 'contact'
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * set the object type
	 * @param objectType
	 */
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	/**
	 * @return name of the contact object
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * set the object name
	 * @param objectName
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	/**
	 * @return IP address of the last Via header in REGISTER request. Will only appear in the event if available
	 */
	public String getViaAddr() {
		return viaAddr;
	}

	/**
	 * @param viaAddr
	 */
	public void setViaAddr(String viaAddr) {
		this.viaAddr = viaAddr;
	}

	/**
	 * @return Port number of the last Via header in REGISTER request. Will only appear in the event if available
	 */
	public Integer getViaPort() {
		return viaPort;
	}

	/**
	 * @param viaPort
	 */
	public void setViaPort(Integer viaPort) {
		this.viaPort = viaPort;
	}

	/**
	 * @return The elapsed time in decimal seconds after which an OPTIONS message is sent before the contact is considered unavailable
	 */
	public Double getQualifyTimeout() {
		return qualifyTimeout;
	}

	/**
	 * @param qualifyTimeout
	 */
	public void setQualifyTimeout(Double qualifyTimeout) {
		this.qualifyTimeout = qualifyTimeout;
	}

	/**
	 * @return Content of the Call-ID header in REGISTER request. Will only appear in the event if available.
	 */
	public String getCallId() {
		return callId;
	}

	/**
	 * @param callId
	 */
	public void setCallId(String callId) {
		this.callId = callId;
	}

	/**
	 * @return Asterisk Server name
	 */
	public String getRegServer() {
		return regServer;
	}

	/**
	 * @param regServer
	 */
	public void setRegServer(String regServer) {
		this.regServer = regServer;
	}

	/**
	 * @return If true contact will be deleted on Asterisk restart/boot
	 */
	public Boolean getPruneOnBoot() {
		return pruneOnBoot;
	}

	/**
	 * @param pruneOnBoot
	 */
	public void setPruneOnBoot(Boolean pruneOnBoot) {
		this.pruneOnBoot = pruneOnBoot;
	}

	/**
	 * @return The Path header received on the REGISTER
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return The name of the endpoint associated with this information
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * @return true if qualify should be authenticated
	 */
	public Boolean getAuthenticateQualify() {
		return authenticateQualify;
	}

	/**
	 * @param authenticateQualify
	 */
	public void setAuthenticateQualify(Boolean authenticateQualify) {
		this.authenticateQualify = authenticateQualify;
	}

	/**
	 * @return contact's URI
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @return The interval in seconds at which the contact will be qualified
	 */
	public String getQualifyFrequency() {
		return qualifyFrequency;
	}

	/**
	 * @param qualifyFrequency
	 */
	public void setQualifyFrequency(String qualifyFrequency) {
		this.qualifyFrequency = qualifyFrequency;
	}

	/**
	 * @return Content of the User-Agent header in REGISTER request
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * @param userAgent
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * @return Absolute time that this contact is no longer valid after
	 */
	public String getExpirationTime() {
		return expirationTime;
	}

	/**
	 * @param expirationTime
	 */
	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}

	/**
	 * @return The contact's outbound proxy
	 */
	public String getOutboundProxy() {
		return outboundProxy;
	}

	/**
	 * @param outboundProxy
	 */
	public void setOutboundProxy(String outboundProxy) {
		this.outboundProxy = outboundProxy;
	}

	/**
	 * @return This contact's status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return The round trip time in microseconds
	 */
	public Long getRoundtripUsec() {
		return roundtripUsec;
	}

	/**
	 * @param roundtripUsec
	 */
	public void setRoundtripUsec(Long roundtripUsec) {
		this.roundtripUsec = roundtripUsec;
	}
}
