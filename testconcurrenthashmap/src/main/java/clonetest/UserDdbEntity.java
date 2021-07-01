package clonetest;
import java.util.*;

public class UserDdbEntity {

    private String tenantSchema;
    private String username;
    private String idmType;
    private String id;
    private String userId;
    private String tenantId;
    private List<ClaimData> data = new ArrayList<>();
    private String createdBy;
    private Date lastModifiedTime;
    private String emailAddress;
    private Date passwordlastModifiedOn;
    private boolean mfaEnabled;
    private int passwordExpiryInterval;
    private int passwordReusabilityFactor;
    private boolean passwordPolicyUpdated;
    private Date lastLoginFailedOn;
    private boolean lock;
    private boolean isPasswordLocal;
    private int loginFailCount;
    private int mfaTimeStep;
    private String mfaSecret;
    private String mfaOtpType;
    private long mfaHotpCounter;
    private String loginAuthenticatorType;
    private String loginAuthenticatorId;
    private boolean ficam;
    private String externalIdentity;
    private Date creationDate;
    private String status;
    private String firstName;
    private String lastName;
    private List<String> certificateIds = new ArrayList<String>();

    public UserDdbEntity() {
    }

    public List<String> getCertificateIds() {
        return certificateIds;
    }

    public void setCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
    }

    public boolean isPasswordLocal() {
        return isPasswordLocal;
    }

    public void setPasswordLocal(boolean passwordLocal) {
        isPasswordLocal = passwordLocal;
    }

    public String getTenantSchema() {
        return tenantSchema;
    }

    public void setTenantSchema(String tenantSchema) {
        this.tenantSchema = tenantSchema;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdmType() {
        return idmType;
    }

    public void setIdmType(String idmType) {
        this.idmType = idmType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public List<ClaimData> getData() {
        return data;
    }

    public void addData(ClaimData data) {
        this.data.add(data);
    }

    public void setData(List<ClaimData> claimDataList) {
        this.data = claimDataList;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getPasswordlastModifiedOn() {
        return passwordlastModifiedOn;
    }

    public void setPasswordlastModifiedOn(Date passwordlastModifiedOn) {
        this.passwordlastModifiedOn = passwordlastModifiedOn;
    }

    public boolean isMfaEnabled() {
        return mfaEnabled;
    }

    public void setMfaEnabled(boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
    }

    public String getMfaSecret() {
        return mfaSecret;
    }

    public void setMfaSecret(String mfaSecret) {
        this.mfaSecret = mfaSecret;
    }

    public int getMfaTimeStep() {
        return mfaTimeStep;
    }

    public void setMfaTimeStep(int mfaTimeStep) {
        this.mfaTimeStep = mfaTimeStep;
    }

    public String getMfaOtpType() { return mfaOtpType; }

    public void setMfaOtpType(String mfaOtpType) { this.mfaOtpType = mfaOtpType; }

    public long getMfaHotpCounter() { return mfaHotpCounter; }

    public void setMfaHotpCounter(long mfaHotpCounter) { this.mfaHotpCounter = mfaHotpCounter; }

    public int getPasswordExpiryInterval() {
        return passwordExpiryInterval;
    }

    public void setPasswordExpiryInterval(int passwordExpiryInterval) {
        this.passwordExpiryInterval = passwordExpiryInterval;
    }

    public int getPasswordReusabilityFactor() {
        return passwordReusabilityFactor;
    }

    public void setPasswordReusabilityFactor(int passwordReusabilityFactor) {
        this.passwordReusabilityFactor = passwordReusabilityFactor;
    }

    public boolean isPasswordPolicyUpdated() {
        return passwordPolicyUpdated;
    }

    public void setPasswordPolicyUpdated(boolean passwordPolicyUpdated) {
        this.passwordPolicyUpdated = passwordPolicyUpdated;
    }

    public Date getLastLoginFailedOn() {
        return lastLoginFailedOn;
    }

    public void setLastLoginFailedOn(Date lastLoginFailedOn) {
        this.lastLoginFailedOn = lastLoginFailedOn;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public int getLoginFailCount() {
        return loginFailCount;
    }

    public void setLoginFailCount(int loginFailCount) {
        this.loginFailCount = loginFailCount;
    }

    public String getLoginAuthenticatorType() { return loginAuthenticatorType; }

    public void setLoginAuthenticatorType(String loginAuthenticatorType) { this.loginAuthenticatorType = loginAuthenticatorType; }

    public String getLoginAuthenticatorId() { return loginAuthenticatorId; }

    public void setLoginAuthenticatorId(String loginAuthenticatorId) { this.loginAuthenticatorId = loginAuthenticatorId; }

    public Boolean getFicam() { return ficam; }

    public void setFicam(Boolean ficam) { this.ficam = ficam; }

    public String getExternalIdentity() {
        return externalIdentity;
    }

    public void setExternalIdentity(String externalIdentity) {
        this.externalIdentity = externalIdentity;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserDdbEntity{");
        sb.append("tenantSchema='").append(tenantSchema).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", idmType='").append(idmType).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", tenantId='").append(tenantId).append('\'');
        sb.append(", data=").append(data);
        sb.append(", createdBy='").append(createdBy).append('\'');
        sb.append(", lastModifiedTime=").append(lastModifiedTime);
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append(", passwordlastModifiedOn=").append(passwordlastModifiedOn);
        sb.append(", mfaEnabled=").append(mfaEnabled);
        sb.append(", passwordExpiryInterval=").append(passwordExpiryInterval);
        sb.append(", passwordReusabilityFactor=").append(passwordReusabilityFactor);
        sb.append(", passwordPolicyUpdated=").append(passwordPolicyUpdated);
        sb.append(", lastLoginFailedOn=").append(lastLoginFailedOn);
        sb.append(", lock=").append(lock);
        sb.append(", isPasswordLocal=").append(isPasswordLocal);
        sb.append(", loginFailCount=").append(loginFailCount);
        sb.append(", mfaTimeStep=").append(mfaTimeStep);
        sb.append(", mfaSecret='").append(mfaSecret).append('\'');
        sb.append(", mfaOtpType='").append(mfaOtpType).append('\'');
        sb.append(", mfaHotpCounter=").append(mfaHotpCounter);
        sb.append(", loginAuthenticatorType='").append(loginAuthenticatorType).append('\'');
        sb.append(", loginAuthenticatorId='").append(loginAuthenticatorId).append('\'');
        sb.append(", ficam=").append(ficam);
        sb.append(", externalIdentity='").append(externalIdentity).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append(", status='").append(status).append('\'');
        sb.append(", certificateIds=").append(certificateIds);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class ClaimData {
        private String claimName;
        private String applicationName;
        private String value;
        private Boolean includeInToken;


        public String getClaimName() {
            return claimName;
        }

        public void setClaimName(String claimName) {
            this.claimName = claimName;
        }

        public String getApplicationName() {
            return applicationName;
        }

        public void setApplicationName(String applicationName) {
            this.applicationName = applicationName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Boolean getIncludeInToken() {
            return includeInToken;
        }

        public void setIncludeInToken(Boolean includeInToken) {
            this.includeInToken = includeInToken;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("UMClaimData{")
                    .append("claimName='" + claimName + '\'')
                    .append(", applicationName='" + applicationName + '\'')
                    .append(", value='" + value + '\'')
                    .append(", includeInToken=" + includeInToken)
                    .append('}');
            return stringBuilder.toString();
        }
    }
}
