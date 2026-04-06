package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzio;
import com.lokalise.sdk.api.Params;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class zzbj {

    /* renamed from: A  reason: collision with root package name */
    public static final zzfz f26257A = F("measurement.upload.stale_data_deletion_interval", 86400000L, new zzdd());
    public static final zzfz A0;

    /* renamed from: B  reason: collision with root package name */
    public static final zzfz f26258B = F("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new zzdc());
    public static final zzfz B0;
    public static final zzfz C = F("measurement.upload.initial_upload_delay_time", 15000L, new zzdf());
    public static final zzfz C0;
    public static final zzfz D = F("measurement.upload.retry_time", 1800000L, new zzde());
    public static final zzfz D0;
    public static final zzfz E = F("measurement.upload.retry_count", 6, new zzdh());
    public static final zzfz E0;
    public static final zzfz F = F("measurement.upload.max_queue_time", 2419200000L, new zzdi());
    public static final zzfz F0;
    public static final zzfz G = F("measurement.upload.google_sginal_max_queue_time", 300000L, new zzdl());
    public static final zzfz G0;
    public static final zzfz H = F("measurement.lifetimevalue.max_currency_tracked", 4, new zzdk());
    public static final zzfz H0;
    public static final zzfz I = F("measurement.audience.filter_result_max_count", 200, new zzdn());
    public static final zzfz I0;
    public static final zzfz J = a("measurement.upload.max_public_user_properties", 25);
    public static final zzfz J0;
    public static final zzfz K = a("measurement.upload.max_event_name_cardinality", 500);
    public static final zzfz K0;
    public static final zzfz L = a("measurement.upload.max_public_event_params", 25);
    public static final zzfz L0;
    public static final zzfz M = F("measurement.service_client.idle_disconnect_millis", 5000L, new zzdm());
    public static final zzfz M0;
    public static final zzfz N;
    public static final zzfz N0;
    public static final zzfz O = F("measurement.test.string_flag", "---", new zzdo());
    public static final zzfz O0;
    public static final zzfz P = F("measurement.test.long_flag", -1L, new zzdr());
    public static final zzfz P0;
    public static final zzfz Q = F("measurement.test.int_flag", -2, new zzdt());
    public static final zzfz Q0;
    public static final zzfz R = F("measurement.test.double_flag", Double.valueOf(-3.0d), new zzdu());
    public static final zzfz R0;
    public static final zzfz S = F("measurement.experiment.max_ids", 50, new zzdx());
    public static final zzfz S0;
    public static final zzfz T = F("measurement.upload.max_item_scoped_custom_parameters", 27, new zzdw());
    public static final zzfz T0;
    public static final zzfz U = b("measurement.upload.max_event_parameter_value_length", 100, new zzdz());
    public static final zzfz U0;
    public static final zzfz V = F("measurement.max_bundles_per_iteration", 100, new zzdy());
    public static final zzfz V0;
    public static final zzfz W = F("measurement.sdk.attribution.cache.ttl", 604800000L, new zzeb());
    public static final zzfz W0;
    public static final zzfz X = F("measurement.redaction.app_instance_id.ttl", 7200000L, new zzea());
    public static final zzfz X0;
    public static final zzfz Y = F("measurement.rb.attribution.client.min_ad_services_version", 7, new zzed());
    public static final zzfz Y0;
    public static final zzfz Z = F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new zzec());
    public static final zzfz Z0;

    /* renamed from: a  reason: collision with root package name */
    public static final List f26259a = Collections.synchronizedList(new ArrayList());
    public static final zzfz a0 = F("measurement.rb.attribution.uri_scheme", "https", new zzee());
    public static final zzfz a1;

    /* renamed from: b  reason: collision with root package name */
    public static final zzfz f26260b = F("measurement.ad_id_cache_time", 10000L, new zzbl());
    public static final zzfz b0 = F("measurement.rb.attribution.uri_authority", "google-analytics.com", new zzeg());
    public static final zzfz b1;

    /* renamed from: c  reason: collision with root package name */
    public static final zzfz f26261c = F("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new zzcu());
    public static final zzfz c0 = F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new zzej());
    public static final zzfz c1;

    /* renamed from: d  reason: collision with root package name */
    public static final zzfz f26262d = F("measurement.monitoring.sample_period_millis", 86400000L, new zzdg());
    public static final zzfz d0 = F("measurement.session.engagement_interval", 3600000L, new zzei());
    public static final zzfz d1;

    /* renamed from: e  reason: collision with root package name */
    public static final zzfz f26263e = c("measurement.config.cache_time", 86400000L, 3600000L, new zzdv(), false);
    public static final zzfz e0 = F("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new zzel());
    public static final zzfz e1;

    /* renamed from: f  reason: collision with root package name */
    public static final zzfz f26264f = F("measurement.config.url_scheme", "https", new zzeh());
    public static final zzfz f0 = F("measurement.rb.attribution.user_properties", "_npa,npa", new zzek());
    public static final zzfz f1;

    /* renamed from: g  reason: collision with root package name */
    public static final zzfz f26265g = F("measurement.config.url_authority", "app-measurement.com", new zzet());
    public static final zzfz g0 = F("measurement.rb.attribution.event_params", "value|currency", new zzen());
    public static final zzfz g1;

    /* renamed from: h  reason: collision with root package name */
    public static final zzfz f26266h = F("measurement.upload.max_bundles", 100, new zzff());
    public static final zzfz h0 = F("measurement.rb.attribution.query_parameters_to_remove", "", new zzem());
    public static final zzfz h1;

    /* renamed from: i  reason: collision with root package name */
    public static final zzfz f26267i = F("measurement.upload.max_batch_size", 65536, new zzfr());
    public static final zzfz i0 = F("measurement.rb.attribution.max_queue_time", 1209600000L, new zzep());
    public static final zzfz i1;

    /* renamed from: j  reason: collision with root package name */
    public static final zzfz f26268j = F("measurement.upload.max_bundle_size", 65536, new zzbq());
    public static final zzfz j0;
    public static final zzfz j1;

    /* renamed from: k  reason: collision with root package name */
    public static final zzfz f26269k = F("measurement.upload.max_events_per_bundle", 1000, new zzcc());
    public static final zzfz k0;
    public static final zzfz k1;

    /* renamed from: l  reason: collision with root package name */
    public static final zzfz f26270l = F("measurement.upload.max_events_per_day", 100000, new zzcf());
    public static final zzfz l0;
    public static final zzfz l1;

    /* renamed from: m  reason: collision with root package name */
    public static final zzfz f26271m = F("measurement.upload.max_error_events_per_day", 1000, new zzck());
    public static final zzfz m0;
    public static final zzfz m1;

    /* renamed from: n  reason: collision with root package name */
    public static final zzfz f26272n = F("measurement.upload.max_public_events_per_day", Integer.valueOf(Params.Timeout.READ_LONG), new zzcm());
    public static final zzfz n0;
    public static final zzfz n1;

    /* renamed from: o  reason: collision with root package name */
    public static final zzfz f26273o = F("measurement.upload.max_conversions_per_day", Integer.valueOf(Params.Timeout.CONNECT_LONG), new zzcp());
    public static final zzfz o0;
    public static final zzfz o1;

    /* renamed from: p  reason: collision with root package name */
    public static final zzfz f26274p = F("measurement.upload.max_realtime_events_per_day", 10, new zzco());
    public static final zzfz p0;

    /* renamed from: q  reason: collision with root package name */
    public static final zzfz f26275q = F("measurement.store.max_stored_events_per_app", 100000, new zzcr());
    public static final zzfz q0;

    /* renamed from: r  reason: collision with root package name */
    public static final zzfz f26276r = F("measurement.upload.url", "https://app-measurement.com/a", new zzcq());
    public static final zzfz r0;

    /* renamed from: s  reason: collision with root package name */
    public static final zzfz f26277s = F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s", new zzct());
    public static final zzfz s0;

    /* renamed from: t  reason: collision with root package name */
    public static final zzfz f26278t = F("measurement.upload.backoff_period", 43200000L, new zzcs());
    public static final zzfz t0 = F("measurement.service.storage_consent_support_version", 203600, new zzfa());

    /* renamed from: u  reason: collision with root package name */
    public static final zzfz f26279u = F("measurement.upload.window_interval", 3600000L, new zzcv());
    public static final zzfz u0;

    /* renamed from: v  reason: collision with root package name */
    public static final zzfz f26280v = F("measurement.upload.interval", 3600000L, new zzcx());
    public static final zzfz v0;

    /* renamed from: w  reason: collision with root package name */
    public static final zzfz f26281w = F("measurement.upload.realtime_upload_interval", 10000L, new zzcz());
    public static final zzfz w0;

    /* renamed from: x  reason: collision with root package name */
    public static final zzfz f26282x = F("measurement.upload.debug_upload_interval", 1000L, new zzcy());
    public static final zzfz x0;

    /* renamed from: y  reason: collision with root package name */
    public static final zzfz f26283y = F("measurement.upload.minimum_delay", 500L, new zzdb());
    public static final zzfz y0;

    /* renamed from: z  reason: collision with root package name */
    public static final zzfz f26284z = F("measurement.alarm_manager.minimum_interval", 60000L, new zzda());
    public static final zzfz z0 = b("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa", new zzfj());

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.FALSE;
        N = F("measurement.test.boolean_flag", bool, new zzdp());
        b("measurement.test.cached_long_flag", -1L, new zzdq());
        Boolean bool2 = Boolean.TRUE;
        j0 = F("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new zzer());
        k0 = F("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new zzeq());
        l0 = F("measurement.collection.log_event_and_bundle_v2", bool2, new zzes());
        m0 = a("measurement.quality.checksum", bool);
        n0 = F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new zzev());
        o0 = F("measurement.audience.refresh_event_count_filters_timestamp", bool, new zzeu());
        p0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new zzex());
        q0 = F("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new zzew());
        r0 = F("measurement.integration.disable_firebase_instance_id", bool, new zzez());
        s0 = F("measurement.collection.service.update_with_analytics_fix", bool, new zzey());
        u0 = F("measurement.service.store_null_safelist", bool2, new zzfd());
        v0 = F("measurement.service.store_safelist", bool2, new zzfc());
        w0 = F("measurement.session_stitching_token_enabled", bool, new zzfe());
        x0 = b("measurement.sgtm.service", bool2, new zzfh());
        y0 = b("measurement.sgtm.preview_mode_enabled", bool2, new zzfg());
        A0 = F("measurement.sgtm.upload_queue", bool, new zzfi());
        B0 = F("measurement.sgtm.google_signal.enable", bool, new zzfl());
        C0 = F("measurement.gmscore_feature_tracking", bool2, new zzfn());
        D0 = F("measurement.gmscore_network_migration", bool, new zzfm());
        E0 = b("measurement.fix_health_monitor_stack_trace", bool2, new zzfp());
        F0 = b("measurement.item_scoped_custom_parameters.client", bool2, new zzfo());
        G0 = F("measurement.item_scoped_custom_parameters.service", bool2, new zzfq());
        H0 = b("measurement.rb.attribution.service", bool2, new zzft());
        I0 = b("measurement.rb.attribution.client2", bool2, new zzfs());
        J0 = F("measurement.rb.attribution.uuid_generation", bool2, new zzfv());
        K0 = F("measurement.rb.attribution.enable_trigger_redaction", bool2, new zzfu());
        F("measurement.rb.attribution.followup1.service", bool, new zzbn());
        L0 = F("measurement.rb.attribution.retry_disposition", bool, new zzbm());
        M0 = F("measurement.rb.attribution.ad_campaign_info", bool, new zzbp());
        N0 = b("measurement.rb.attribution.improved_retry", bool2, new zzbo());
        O0 = F("measurement.client.sessions.enable_fix_background_engagement", bool, new zzbr());
        P0 = F("measurement.client.sessions.enable_pause_engagement_in_background", bool2, new zzbt());
        Q0 = F("measurement.dma_consent.service_dcu_event2", bool2, new zzbs());
        R0 = F("measurement.dma_consent.services_database_update_fix", bool2, new zzbv());
        S0 = b("measurement.service.deferred_first_open", bool2, new zzbu());
        T0 = b("measurement.gbraid_campaign.gbraid.client", bool, new zzbw());
        U0 = b("measurement.gbraid_campaign.gbraid.service", bool, new zzbz());
        V0 = b("measurement.increase_param_lengths", bool2, new zzby());
        W0 = F("measurement.disable_npa_for_dasher_and_unicorn", bool2, new zzcb());
        X0 = b("measurement.consent_regional_defaults.service", bool2, new zzca());
        Y0 = b("measurement.consent_regional_defaults.client2", bool2, new zzcd());
        Z0 = F("measurement.service.consent.pfo_on_fx", bool2, new zzcn());
        a1 = F("measurement.service.consent.params_on_fx", bool2, new zzcw());
        b1 = F("measurement.service.consent.app_start_fix", bool2, new zzdj());
        c1 = b("measurement.consent.stop_reset_on_storage_denied.client", bool2, new zzds());
        d1 = b("measurement.consent.stop_reset_on_storage_denied.service", bool2, new zzef());
        e1 = F("measurement.consent.scrub_audience_data_analytics_consent", bool2, new zzeo());
        f1 = F("measurement.consent.fix_first_open_count_from_snapshot", bool2, new zzfb());
        g1 = F("measurement.fix_engagement_on_reset_analytics_data", bool2, new zzfk());
        h1 = F("measurement.rb.attribution.service.bundle_on_backgrounded", bool, new zzbk());
        i1 = F("measurement.rb.attribution.client.bundle_on_backgrounded", bool, new zzbx());
        j1 = F("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new zzce());
        k1 = F("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new zzch());
        l1 = F("measurement.set_default_event_parameters_with_backfill.service", bool, new zzcg());
        m1 = F("measurement.set_default_event_parameters_with_backfill.client.dev", bool, new zzcj());
        n1 = F("measurement.fix_origin_in_upload_utils.service", bool2, new zzci());
        o1 = F("measurement.service.ad_impression.convert_value_to_double", bool2, new zzcl());
    }

    public static zzfz F(String str, Object obj, zzfx zzfx) {
        return c(str, obj, obj, zzfx, false);
    }

    public static zzfz a(String str, Object obj) {
        return c(str, obj, obj, (zzfx) null, false);
    }

    public static zzfz b(String str, Object obj, zzfx zzfx) {
        return c(str, obj, obj, zzfx, true);
    }

    public static zzfz c(String str, Object obj, Object obj2, zzfx zzfx, boolean z2) {
        zzfz zzfz = new zzfz(str, obj, obj2, zzfx, z2);
        if (z2) {
            f26259a.add(zzfz);
        }
        return zzfz;
    }

    public static Map e(Context context) {
        zzic a2 = zzic.a(context.getContentResolver(), zzio.a("com.google.android.gms.measurement"), new zzbi());
        return a2 == null ? Collections.emptyMap() : a2.b();
    }
}
