package org.apache.oltu.oauth2.common;

public enum OAuthProviderType {
    FACEBOOK("facebook", "https://graph.facebook.com/oauth/authorize", "https://graph.facebook.com/oauth/access_token"),
    FOURSQUARE("foursquare", "https://foursquare.com/oauth2/authenticate", "https://foursquare.com/oauth2/access_token"),
    GITHUB("GitHub", "https://github.com/login/oauth/authorize", "https://github.com/login/oauth/access_token"),
    GOOGLE("Google", "https://accounts.google.com/o/oauth2/auth", "https://accounts.google.com/o/oauth2/token"),
    INSTAGRAM("Instagram", "https://api.instagram.com/oauth/authorize", "https://api.instagram.com/oauth/access_token"),
    LINKEDIN("LinkedIn", "https://www.linkedin.com/uas/oauth2/authorization", "https://www.linkedin.com/uas/oauth2/accessToken"),
    MICROSOFT("Microsoft", "https://login.live.com/oauth20_authorize.srf", "https://login.live.com/oauth20_token.srf"),
    PAYPAL("PayPal", "https://identity.x.com/xidentity/resources/authorize", "https://identity.x.com/xidentity/oauthtokenservice"),
    REDDIT("reddit", "https://ssl.reddit.com/api/v1/authorize", "https://ssl.reddit.com/api/v1/access_token"),
    SALESFORCE("salesforce", "https://login.salesforce.com/services/oauth2/authorize", "https://login.salesforce.com/services/oauth2/token"),
    YAMMER("Yammer", "https://www.yammer.com/dialog/oauth", "https://www.yammer.com/oauth2/access_token.json");
    

    /* renamed from: A  reason: collision with root package name */
    public String f43524A;

    /* renamed from: B  reason: collision with root package name */
    public String f43525B;

    /* renamed from: z  reason: collision with root package name */
    public String f43526z;

    /* access modifiers changed from: public */
    OAuthProviderType(String str, String str2, String str3) {
        this.f43526z = str;
        this.f43524A = str2;
        this.f43525B = str3;
    }
}
