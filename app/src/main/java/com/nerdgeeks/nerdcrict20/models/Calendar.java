
package com.nerdgeeks.nerdcrict20.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Calendar {

    @SerializedName("creditsLeft")
    @Expose
    private Integer creditsLeft;
    @SerializedName("provider")
    @Expose
    private Provider provider;
    @SerializedName("ttl")
    @Expose
    private Integer ttl;
    @SerializedName("v")
    @Expose
    private String v;
    @SerializedName("cache")
    @Expose
    private Boolean cache;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Integer getCreditsLeft() {
        return creditsLeft;
    }

    public void setCreditsLeft(Integer creditsLeft) {
        this.creditsLeft = creditsLeft;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public Boolean getCache() {
        return cache;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public List<Datum> getCalendarData() {
        return data;
    }

    public void setCalendarData(List<Datum> data) {
        this.data = data;
    }

}
