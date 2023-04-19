package com.hsone.finest.feescheduler.adapter.entity;

public class PracticeCustomizationEntity {
    private static final String DEFAULT_WELCOME_TEXT = "Welcome to the Dental office!";
    private static final String DEFAULT_THANK_YOU_TEXT = "Thank you for your answers, {Patient Name}.";

    private String welcomeText;
    private String thankYouText;
    private String merchantID;
    private boolean takePhoto;
    private String storeId;
    private String apiToken;
    private String terminalId;
    private String footerInfo;
    private Boolean hasDocumentCenterCopy;
    private Boolean requireCVV;
    private CardSwipeDevice swipeDevice;
    private OrganizationEntity organization;

    public PracticeCustomizationEntity(final String welcomeText, final String thankYouText, final String merchantID,
                                       final boolean takePhoto, final String storeId, final String apiToken,
                                       final String terminalId, final String footerInfo, final Boolean hasDocumentCenterCopy,
                                       final Boolean requireCVV, final CardSwipeDevice swipeDevice,
                                       final OrganizationEntity organization) {
        this.welcomeText = welcomeText;
        this.thankYouText = thankYouText;
        this.merchantID = merchantID;
        this.takePhoto = takePhoto;
        this.storeId = storeId;
        this.apiToken = apiToken;
        this.terminalId = terminalId;
        this.footerInfo = footerInfo;
        this.hasDocumentCenterCopy = hasDocumentCenterCopy;
        this.requireCVV = requireCVV;
        this.swipeDevice = swipeDevice;
        this.organization = organization;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(final String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public String getThankYouText() {
        return thankYouText;
    }

    public void setThankYouText(final String thankYouText) {
        this.thankYouText = thankYouText;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(final String merchantID) {
        this.merchantID = merchantID;
    }

    public boolean isTakePhoto() {
        return takePhoto;
    }

    public void setTakePhoto(final boolean takePhoto) {
        this.takePhoto = takePhoto;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(final String storeId) {
        this.storeId = storeId;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(final String apiToken) {
        this.apiToken = apiToken;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(final String terminalId) {
        this.terminalId = terminalId;
    }

    public String getFooterInfo() {
        return footerInfo;
    }

    public void setFooterInfo(final String footerInfo) {
        this.footerInfo = footerInfo;
    }

    public Boolean getHasDocumentCenterCopy() {
        return hasDocumentCenterCopy;
    }

    public void setHasDocumentCenterCopy(final Boolean hasDocumentCenterCopy) {
        this.hasDocumentCenterCopy = hasDocumentCenterCopy;
    }

    public Boolean getRequireCVV() {
        return requireCVV;
    }

    public void setRequireCVV(final Boolean requireCVV) {
        this.requireCVV = requireCVV;
    }

    public CardSwipeDevice getSwipeDevice() {
        return swipeDevice;
    }

    public void setSwipeDevice(final CardSwipeDevice swipeDevice) {
        this.swipeDevice = swipeDevice;
    }

    public OrganizationEntity getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationEntity organization) {
        this.organization = organization;
    }
}
