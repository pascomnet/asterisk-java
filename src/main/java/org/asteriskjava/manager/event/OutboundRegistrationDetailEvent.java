package org.asteriskjava.manager.event;

/**
 * @author Stefan Tosic
 * @since 2019-10-07
 */
public class OutboundRegistrationDetailEvent extends ResponseEvent {

	/**
	 * Serial version identifier.
	 */
	private static final long serialVersionUID = 2778011196643095118L;

	public OutboundRegistrationDetailEvent(Object source) {
		super(source);
	}

	private String objectType;
	private String objectName;
	private int maxRetries;
	private String clientUri;
	private boolean authRejectionPermanent;
	private String serverUri;
	private boolean supportPath;
	private int retryInterval;
	private int expiration;
	private String transport;
	private boolean line;
	private String contactUser;
	private String endpoint;
	private int forbiddenRetryInterval;
	private String outboundAuth;
	private String outboundProxy;
	private int fatalRetryInterval;
	private String status;
	private int nextReg;

	/**
	 * @return
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * @param objectType
	 */
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	/**
	 * @return
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * @param objectName
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	/**
	 * @return
	 */
	public int getMaxRetries() {
		return maxRetries;
	}

	/**
	 * @param maxRetries
	 */
	public void setMaxRetries(int maxRetries) {
		this.maxRetries = maxRetries;
	}

	/**
	 * @return
	 */
	public String getClientUri() {
		return clientUri;
	}

	/**
	 * @param clientUri
	 */
	public void setClientUri(String clientUri) {
		this.clientUri = clientUri;
	}

	/**
	 * @return
	 */
	public boolean isAuthRejectionPermanent() {
		return authRejectionPermanent;
	}

	/**
	 * @param authRejectionPermanent
	 */
	public void setAuthRejectionPermanent(boolean authRejectionPermanent) {
		this.authRejectionPermanent = authRejectionPermanent;
	}

	/**
	 * @return
	 */
	public String getServerUri() {
		return serverUri;
	}

	/**
	 * @param serverUri
	 */
	public void setServerUri(String serverUri) {
		this.serverUri = serverUri;
	}

	/**
	 * @return
	 */
	public boolean isSupportPath() {
		return supportPath;
	}

	/**
	 * @param supportPath
	 */
	public void setSupportPath(boolean supportPath) {
		this.supportPath = supportPath;
	}

	/**
	 * @return
	 */
	public int getRetryInterval() {
		return retryInterval;
	}

	/**
	 * @param retryInterval
	 */
	public void setRetryInterval(int retryInterval) {
		this.retryInterval = retryInterval;
	}

	/**
	 * @return
	 */
	public int getExpiration() {
		return expiration;
	}

	/**
	 * @param expiration
	 */
	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}

	/**
	 * @return
	 */
	public String getTransport() {
		return transport;
	}

	/**
	 * @param transport
	 */
	public void setTransport(String transport) {
		this.transport = transport;
	}

	/**
	 * @return
	 */
	public boolean isLine() {
		return line;
	}

	/**
	 * @param line
	 */
	public void setLine(boolean line) {
		this.line = line;
	}

	/**
	 * @return
	 */
	public String getContactUser() {
		return contactUser;
	}

	/**
	 * @param contactUser
	 */
	public void setContactUser(String contactUser) {
		this.contactUser = contactUser;
	}

	/**
	 * @return
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
	 * @return
	 */
	public int getForbiddenRetryInterval() {
		return forbiddenRetryInterval;
	}

	/**
	 * @param forbiddenRetryInterval
	 */
	public void setForbiddenRetryInterval(int forbiddenRetryInterval) {
		this.forbiddenRetryInterval = forbiddenRetryInterval;
	}

	/**
	 * @return
	 */
	public String getOutboundAuth() {
		return outboundAuth;
	}

	/**
	 * @param outboundAuth
	 */
	public void setOutboundAuth(String outboundAuth) {
		this.outboundAuth = outboundAuth;
	}

	/**
	 * @return
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
	 * @return
	 */
	public int getFatalRetryInterval() {
		return fatalRetryInterval;
	}

	/**
	 * @param fatalRetryInterval
	 */
	public void setFatalRetryInterval(int fatalRetryInterval) {
		this.fatalRetryInterval = fatalRetryInterval;
	}

	/**
	 * @return
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
	 * @return
	 */
	public int getNextReg() {
		return nextReg;
	}

	/**
	 * @param nextReg
	 */
	public void setNextReg(int nextReg) {
		this.nextReg = nextReg;
	}
}

