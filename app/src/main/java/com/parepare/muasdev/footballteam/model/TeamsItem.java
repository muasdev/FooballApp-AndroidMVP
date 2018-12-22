package com.parepare.muasdev.footballteam.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "teams")
public class TeamsItem {

    @ColumnInfo(name = "intStadiumCapacity")
    @SerializedName("intStadiumCapacity")
    private String intStadiumCapacity;

    @ColumnInfo(name = "strTeamShort")
    @SerializedName("strTeamShort")
    private String strTeamShort;

    @ColumnInfo(name = "intFormedYear")
    @SerializedName("intFormedYear")
    private String intFormedYear;

    @ColumnInfo(name = "strInstagram")
    @SerializedName("strInstagram")
    private String strInstagram;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "idTeam")
    @SerializedName("idTeam")
    private String idTeam;

    @ColumnInfo(name = "strDescriptionEN")
    @SerializedName("strDescriptionEN")
    private String strDescriptionEN;

    @ColumnInfo(name = "strTeamJersey")
    @SerializedName("strTeamJersey")
    private String strTeamJersey;

    @ColumnInfo(name = "strWebsite")
    @SerializedName("strWebsite")
    private String strWebsite;

    @ColumnInfo(name = "strYoutube")
    @SerializedName("strYoutube")
    private String strYoutube;

    @ColumnInfo(name = "strStadiumDescription")
    @SerializedName("strStadiumDescription")
    private String strStadiumDescription;

    @ColumnInfo(name = "intLoved")
    @SerializedName("intLoved")
    private String intLoved;

    @ColumnInfo(name = "idSoccerXML")
    @SerializedName("idSoccerXML")
    private String idSoccerXML;

    @ColumnInfo(name = "strAlternate")
    @SerializedName("strAlternate")
    private String strAlternate;

    @ColumnInfo(name = "strTeam")
    @SerializedName("strTeam")
    private String strTeam;

    @ColumnInfo(name = "strTwitter")
    @SerializedName("strTwitter")
    private String strTwitter;

    @ColumnInfo(name = "strTeamLogo")
    @SerializedName("strTeamLogo")
    private String strTeamLogo;

    @ColumnInfo(name = "strStadium")
    @SerializedName("strStadium")
    private String strStadium;

    @ColumnInfo(name = "strStadiumLocation")
    @SerializedName("strStadiumLocation")
    private String strStadiumLocation;

    @ColumnInfo(name = "strFacebook")
    @SerializedName("strFacebook")
    private String strFacebook;

    @ColumnInfo(name = "strTeamBadge")
    @SerializedName("strTeamBadge")
    private String strTeamBadge;

    @ColumnInfo(name = "strCountry")
    @SerializedName("strCountry")
    private String strCountry;

    @ColumnInfo(name = "strRSS")
    @SerializedName("strRSS")
    private String strRSS;

    @ColumnInfo(name = "strTeamBanner")
    @SerializedName("strTeamBanner")
    private String strTeamBanner;

    @ColumnInfo(name = "strManager")
    @SerializedName("strManager")
    private String strManager;

    @ColumnInfo(name = "strKeywords")
    @SerializedName("strKeywords")
    private String strKeywords;

    @ColumnInfo(name = "strStadiumThumb")
    @SerializedName("strStadiumThumb")
    private String strStadiumThumb;

    public TeamsItem(String intStadiumCapacity, String strTeamShort, String intFormedYear, String strInstagram, String idTeam, String strDescriptionEN, String strTeamJersey, String strWebsite, String strYoutube, String strStadiumDescription, String intLoved, String idSoccerXML, String strAlternate, String strTeam, String strTwitter, String strTeamLogo, String strStadium, String strStadiumLocation, String strFacebook, String strTeamBadge, String strCountry, String strRSS, String strTeamBanner, String strManager, String strKeywords, String strStadiumThumb) {
        this.intStadiumCapacity = intStadiumCapacity;
        this.strTeamShort = strTeamShort;
        this.intFormedYear = intFormedYear;
        this.strInstagram = strInstagram;
        this.idTeam = idTeam;
        this.strDescriptionEN = strDescriptionEN;
        this.strTeamJersey = strTeamJersey;
        this.strWebsite = strWebsite;
        this.strYoutube = strYoutube;
        this.strStadiumDescription = strStadiumDescription;
        this.intLoved = intLoved;
        this.idSoccerXML = idSoccerXML;
        this.strAlternate = strAlternate;
        this.strTeam = strTeam;
        this.strTwitter = strTwitter;
        this.strTeamLogo = strTeamLogo;
        this.strStadium = strStadium;
        this.strStadiumLocation = strStadiumLocation;
        this.strFacebook = strFacebook;
        this.strTeamBadge = strTeamBadge;
        this.strCountry = strCountry;
        this.strRSS = strRSS;
        this.strTeamBanner = strTeamBanner;
        this.strManager = strManager;
        this.strKeywords = strKeywords;
        this.strStadiumThumb = strStadiumThumb;
    }

    public void setIntStadiumCapacity(String intStadiumCapacity) {
        this.intStadiumCapacity = intStadiumCapacity;
    }

    public String getIntStadiumCapacity() {
        return intStadiumCapacity;
    }

    public void setStrTeamShort(String strTeamShort) {
        this.strTeamShort = strTeamShort;
    }

    public String getStrTeamShort() {
        return strTeamShort;
    }

    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    public String getIntFormedYear() {
        return intFormedYear;
    }

    public void setStrInstagram(String strInstagram) {
        this.strInstagram = strInstagram;
    }

    public String getStrInstagram() {
        return strInstagram;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrTeamJersey(String strTeamJersey) {
        this.strTeamJersey = strTeamJersey;
    }

    public String getStrTeamJersey() {
        return strTeamJersey;
    }

    public void setStrWebsite(String strWebsite) {
        this.strWebsite = strWebsite;
    }

    public String getStrWebsite() {
        return strWebsite;
    }

    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    public String getStrYoutube() {
        return strYoutube;
    }

    public void setStrStadiumDescription(String strStadiumDescription) {
        this.strStadiumDescription = strStadiumDescription;
    }

    public String getStrStadiumDescription() {
        return strStadiumDescription;
    }

    public void setIntLoved(String intLoved) {
        this.intLoved = intLoved;
    }

    public String getIntLoved() {
        return intLoved;
    }

    public void setIdSoccerXML(String idSoccerXML) {
        this.idSoccerXML = idSoccerXML;
    }

    public String getIdSoccerXML() {
        return idSoccerXML;
    }

    public void setStrAlternate(String strAlternate) {
        this.strAlternate = strAlternate;
    }

    public String getStrAlternate() {
        return strAlternate;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTwitter(String strTwitter) {
        this.strTwitter = strTwitter;
    }

    public String getStrTwitter() {
        return strTwitter;
    }

    public void setStrTeamLogo(String strTeamLogo) {
        this.strTeamLogo = strTeamLogo;
    }

    public String getStrTeamLogo() {
        return strTeamLogo;
    }

    public void setStrStadium(String strStadium) {
        this.strStadium = strStadium;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public void setStrStadiumLocation(String strStadiumLocation) {
        this.strStadiumLocation = strStadiumLocation;
    }

    public String getStrStadiumLocation() {
        return strStadiumLocation;
    }

    public void setStrFacebook(String strFacebook) {
        this.strFacebook = strFacebook;
    }

    public String getStrFacebook() {
        return strFacebook;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrRSS(String strRSS) {
        this.strRSS = strRSS;
    }

    public String getStrRSS() {
        return strRSS;
    }

    public void setStrTeamBanner(String strTeamBanner) {
        this.strTeamBanner = strTeamBanner;
    }

    public String getStrTeamBanner() {
        return strTeamBanner;
    }

    public void setStrManager(String strManager) {
        this.strManager = strManager;
    }

    public String getStrManager() {
        return strManager;
    }

    public void setStrKeywords(String strKeywords) {
        this.strKeywords = strKeywords;
    }

    public String getStrKeywords() {
        return strKeywords;
    }

    public void setStrStadiumThumb(String strStadiumThumb) {
        this.strStadiumThumb = strStadiumThumb;
    }

    public String getStrStadiumThumb() {
        return strStadiumThumb;
    }
}