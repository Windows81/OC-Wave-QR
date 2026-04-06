package com.hansecom.abt.data.config.help;

import kotlin.Metadata;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class HelpScreenOptions {

    /* renamed from: a  reason: collision with root package name */
    public static final HelpScreenOptions f33202a = new HelpScreenOptions();

    /* renamed from: b  reason: collision with root package name */
    public static final PersistentList f33203b = ExtensionsKt.b("Phone Call", "Email Sent", "No Communication Sent");

    /* renamed from: c  reason: collision with root package name */
    public static final PersistentList f33204c = ExtensionsKt.b("Support Request", "Question", "Feedback");

    /* renamed from: d  reason: collision with root package name */
    public static final PersistentList f33205d = ExtensionsKt.b("Account Document Request", "Balance Issue", "Card Lost / Stolen", "Card Not Reading", "Card Not Received", "Card Order", "Close Card", "Discount Fare Application", "Equipment Issue", "Fare Inspection", "Forgot Username", "General Inquiry", "Institutional Account Inquiry", "Link Sub-Account", "Mobile Card Issue", "New problem", "On Hold Order", "Other", "Refund Request", "Retail Outlet Issue", "Rewards Program", "Ride Sponsor Account Inquiry", "Institution Creation");

    public final PersistentList a() {
        return f33204c;
    }

    public final PersistentList b() {
        return f33205d;
    }

    public final PersistentList c() {
        return f33203b;
    }
}
