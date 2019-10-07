package org.asteriskjava.manager.event;

/**
 * @author Stefan Tosic
 * @since 2019-10-07
 */
public class AuthDetailEvent extends ResponseEvent {

	/**
	 * Serial version identifier.
	 */
	private static final long serialVersionUID = 390429702738009123L;

	/**
	 * Creates a new instance.
	 *
	 * @param source
	 */
	public AuthDetailEvent(Object source) {
		super(source);
	}

	private String objectType;
	private String objectName;
	private String username;
	private String password;
	private String md5Cred;
	private String realm;
	private Long nonceLifetime;
	private String authType;
	private String endpointName;


	/**
	 * The object's type. This will always be 'auth'
	 * @return
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * Set the object type
	 * @param objectType
	 */
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	/**
	 * The name of this object
	 * @return
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * Set the object name
	 * @param objectName
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	/**
	 * Username to use for account
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 *
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Password to use for account
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 *
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * MD5 Hash used for authentication
	 * @return
	 */
	public String getMd5Cred() {
		return md5Cred;
	}

	/**
	 *
	 * @param md5Cred
	 */
	public void setMd5Cred(String md5Cred) {
		this.md5Cred = md5Cred;
	}

	/**
	 * SIP realm for endpoint
	 * @return
	 */
	public String getRealm() {
		return realm;
	}

	/**
	 *
	 * @param realm
	 */
	public void setRealm(String realm) {
		this.realm = realm;
	}

	/**
	 * Lifetime of a nonce associated with this authentication config
	 * @return
	 */
	public Long getNonceLifetime() {
		return nonceLifetime;
	}

	/**
	 *
	 * @param nonceLifetime
	 */
	public void setNonceLifetime(Long nonceLifetime) {
		this.nonceLifetime = nonceLifetime;
	}

	/**
	 * Authentication type
	 * @return
	 */
	public String getAuthType() {
		return authType;
	}

	/**
	 *
	 * @param authType
	 */
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	/**
	 * The name of the endpoint associated with this information
	 * @return
	 */
	public String getEndpointName() {
		return endpointName;
	}

	/**
	 *
	 * @param endpointName
	 */
	public void setEndpointName(String endpointName) {
		this.endpointName = endpointName;
	}


}



