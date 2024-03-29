package org.mlp.apps.occurrence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "darwin_core")
public class OccurrenceSave {

	@Id
    @GeneratedValue
    @Column(name = "iddwc")
    private Integer id;
	
	@Column(name = "institutioncode")
    private String institutioncode;

    @Column(name = "collectioncode")
    private String collectioncode;

    @Column(name = "datasetname")
    private String datasetname;

    @Column(name = "ownerinstitutioncode")
    private String ownerinstitutioncode;

    @Column(name = "basisofrecord")
    private String basisofrecord;

    @Column(name = "informationwithheld")
    private String informationwithheld;

    @Column(name = "datageneralizations")
    private String datageneralizations;

    @Column(name = "dynamicproperties")
    private String dynamicproperties;

    @Column(name = "taxon_id")
    private String taxonId;

    @Column(name = "scientific_name_id")
    private String scientificNameId;

    @Column(name = "accepted_name_usage_id")
    private String acceptedNameUsageId;

    @Column(name = "parent_name_usage_id")
    private String parentNameUsageId;

    @Column(name = "original_name_usage_id")
    private String originalNameUsageId;

    @Column(name = "name_according_to_id")
    private String nameAccordingToId;

    @Column(name = "name_published_in_id")
    private String namePublishedInId;

    @Column(name = "taxon_concept_id")
    private String taxonConceptId;

    @Column(name = "scientificname")
    private String scientificname;

    @Column(name = "acceptednameusage")
    private String acceptednameusage;

    @Column(name = "parent_name_usage")
    private String parentNameUsage;

    @Column(name = "original_name_usage")
    private String originalNameUsage;

    @Column(name = "name_according_to")
    private String nameAccordingTo;

    @Column(name = "name_published_in")
    private String namePublishedIn;

    @Column(name = "higherclassification")
    private String higherclassification;

    @Column(name = "kingdom")
    private String kingdom;

    @Column(name = "phylum")
    private String phylum;

    @Column(name = "darwinclass")
    private String darwinclass;

    @Column(name = "darwinorder")
    private String darwinorder;

    @Column(name = "family")
    private String family;

    @Column(name = "genus")
    private String genus;

    @Column(name = "subgenus")
    private String subgenus;

    @Column(name = "specificepithet")
    private String specificepithet;

    @Column(name = "infraspecificepithet")
    private String infraspecificepithet;

    @Column(name = "taxonrank")
    private String taxonrank;

    @Column(name = "verbatimtaxonrank")
    private String verbatimtaxonrank;

    @Column(name = "scientificnameauthorship")
    private String scientificnameauthorship;

    @Column(name = "vernacularname")
    private String vernacularname;

    @Column(name = "nomenclaturalcode")
    private String nomenclaturalcode;

    @Column(name = "taxonomic_status")
    private String taxonomicStatus;

    @Column(name = "nomenclatural_status")
    private String nomenclaturalStatus;

    @Column(name = "taxonremarks")
    private String taxonremarks;

    @Column(name = "occurence_id")
    private String occurrenceId;

    @Column(name = "catalognumber")
    private String catalognumber;

    @Column(name = "occurence_details")
    private String occurrenceDetails;

    @Column(name = "occurrenceremarks")
    private String occurrenceremarks;

    @Column(name = "recordnumber")
    private String recordnumber;

    @Column(name = "recordedby")
    private String recordedby;

    @Column(name = "individual_id")
    private String individualId;

    @Column(name = "individualcount")
    private String individualcount;

    @Column(name = "sex")
    private String sex;

    @Column(name = "lifestage")
    private String lifestage;

    @Column(name = "reproductivecondition")
    private String reproductivecondition;

    @Column(name = "behavior")
    private String behavior;

    @Column(name = "establishment_means")
    private String establishmentMeans;

    @Column(name = "occurence_status")
    private String occurrenceStatus;

    @Column(name = "preparations")
    private String preparations;

    @Column(name = "disposition")
    private String disposition;

    @Column(name = "othercatalognumbers")
    private String othercatalognumbers;

    @Column(name = "previousidentifications")
    private String previousidentifications;

    @Column(name = "associatedmedia")
    private String associatedmedia;

    @Column(name = "associatedreferences")
    private String associatedreferences;

    @Column(name = "associatedoccurrences")
    private String associatedoccurrences;

    @Column(name = "associatedsequences")
    private String associatedsequences;

    @Column(name = "associatedtaxa")
    private String associatedtaxa;

    @Column(name = "event_id")
    private String eventId;

    @Column(name = "samplingprotocol")
    private String samplingprotocol;

    @Column(name = "samplingeffort")
    private String samplingeffort;

    @Column(name = "eventdate")
    private String eventdate;

    @Column(name = "eventtime")
    private String eventtime;

    @Column(name = "startdayofyear")
    private String startdayofyear;

    @Column(name = "enddayofyear")
    private String enddayofyear;

    @Column(name = "dwcyear")
    private String dwcyear;

    @Column(name = "dwcmonth")
    private String dwcmonth;

    @Column(name = "dwcday")
    private String dwcday;

    @Column(name = "verbatimeventdate")
    private String verbatimeventdate;

    @Column(name = "habitat")
    private String habitat;

    @Column(name = "fieldnumber")
    private String fieldnumber;

    @Column(name = "fieldnotes")
    private String fieldnotes;

    @Column(name = "eventremarks")
    private String eventremarks;

    @Column(name = "location_id")
    private String locationId;

    @Column(name = "higher_geography_id")
    private String higherGeographyId;

    @Column(name = "highergeography")
    private String highergeography;

    @Column(name = "continent")
    private String continent;

    @Column(name = "waterbody")
    private String waterbody;

    @Column(name = "islandgroup")
    private String islandgroup;

    @Column(name = "island")
    private String island;

    @Column(name = "country")
    private String country;

    @Column(name = "countrycode")
    private String countrycode;

    @Column(name = "stateprovince")
    private String stateprovince;

    @Column(name = "county")
    private String county;

    @Column(name = "municipality")
    private String municipality;

    @Column(name = "locality")
    private String locality;

    @Column(name = "verbatimlocality")
    private String verbatimlocality;

    @Column(name = "verbatimelevation")
    private String verbatimelevation;

    @Column(name = "minimumelevationinmeters")
    private String minimumelevationinmeters;

    @Column(name = "maximumelevationinmeters")
    private String maximumelevationinmeters;

    @Column(name = "verbatimdepth")
    private String verbatimdepth;

    @Column(name = "minimumdepthinmeters")
    private String minimumdepthinmeters;

    @Column(name = "maximumdepthinmeters")
    private String maximumdepthinmeters;

    @Column(name = "minimumdistanceabovesurfaceinmeters")
    private String minimumdistanceabovesurfaceinmeters;

    @Column(name = "maximumdistanceabovesurfaceinmeters")
    private String maximumdistanceabovesurfaceinmeters;

    @Column(name = "locationaccordingto")
    private String locationaccordingto;

    @Column(name = "locationremarks")
    private String locationremarks;

    @Column(name = "verbatimcoordinates")
    private String verbatimcoordinates;

    @Column(name = "verbatimlatitude")
    private String verbatimlatitude;

    @Column(name = "verbatimlongitude")
    private String verbatimlongitude;

    @Column(name = "verbatimcoordinatesystem")
    private String verbatimcoordinatesystem;

    @Column(name = "verbatimsrs")
    private String verbatimsrs;

    @Column(name = "decimallatitude")
    private String decimallatitude;

    @Column(name = "decimallongitude")
    private String decimallongitude;

    @Column(name = "geodeticdatum")
    private String geodeticdatum;

    @Column(name = "coordinateuncertaintyinmeters")
    private String coordinateuncertaintyinmeters;

    @Column(name = "coordinateprecision")
    private String coordinateprecision;

    @Column(name = "pointradiusspatialfit")
    private String pointradiusspatialfit;

    @Column(name = "footprintwkt")
    private String footprintwkt;

    @Column(name = "footprintsrs")
    private String footprintsrs;

    @Column(name = "footprintspatialfit")
    private String footprintspatialfit;

    @Column(name = "georeferencedby")
    private String georeferencedby;

    @Column(name = "georeferenceprotocol")
    private String georeferenceprotocol;

    @Column(name = "georeferencesources")
    private String georeferencesources;

    @Column(name = "georeferenceverificationstatus")
    private String georeferenceverificationstatus;

    @Column(name = "georeferenceremarks")
    private String georeferenceremarks;

    @Column(name = "identification_id")
    private String identificationId;

    @Column(name = "identifiedby")
    private String identifiedby;

    @Column(name = "dateidentified")
    private String dateidentified;

    @Column(name = "identificationreferences")
    private String identificationreferences;

    @Column(name = "identificationremarks")
    private String identificationremarks;

    @Column(name = "identificationqualifier")
    private String identificationqualifier;

    @Column(name = "typestatus")
    private String typestatus;

    @Column(name = "idutilisateurupload")
    private Integer idUtilisateurUpload;

    @Column(name = "idrebioma")
    private Integer idRebioma;

    @Column(name = "lien_source")
    private String lienSource;

    @Column(name = "validated")
    private String validated;

    @Column(name = "reviewed")
    private String reviewed;

    @Column(name = "est_publique")
    private Boolean publique;

    private void getYearFromEventDate() {
        String[] temp = eventdate.split("-|/");
        if (temp.length == 3) {
            for (int i = 1; i <= temp.length; i++) {
                int pas = i - 1;
                if (temp[pas].length() >= 4) {
                    this.dwcyear = temp[pas];
                }
            }
        }
    }

    public String getInstitutioncode() {
        return institutioncode;
    }

    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }

    public String getCollectioncode() {
        return collectioncode;
    }

    public void setCollectioncode(String collectioncode) {
        this.collectioncode = collectioncode;
    }

    public String getDatasetname() {
        return datasetname;
    }

    public void setDatasetname(String datasetname) {
        this.datasetname = datasetname;
    }

    public String getOwnerinstitutioncode() {
        return ownerinstitutioncode;
    }

    public void setOwnerinstitutioncode(String ownerinstitutioncode) {
        this.ownerinstitutioncode = ownerinstitutioncode;
    }

    public String getBasisofrecord() {
        return basisofrecord;
    }

    public void setBasisofrecord(String basisofrecord) {
        this.basisofrecord = basisofrecord;
    }

    public String getInformationwithheld() {
        return informationwithheld;
    }

    public void setInformationwithheld(String informationwithheld) {
        this.informationwithheld = informationwithheld;
    }

    public String getDatageneralizations() {
        return datageneralizations;
    }

    public void setDatageneralizations(String datageneralizations) {
        this.datageneralizations = datageneralizations;
    }

    public String getDynamicproperties() {
        return dynamicproperties;
    }

    public void setDynamicproperties(String dynamicproperties) {
        this.dynamicproperties = dynamicproperties;
    }

    public String getTaxonId() {
        return taxonId;
    }

    public void setTaxonId(String taxonId) {
        this.taxonId = taxonId;
    }

    public String getScientificNameId() {
        return scientificNameId;
    }

    public void setScientificNameId(String scientificNameId) {
        this.scientificNameId = scientificNameId;
    }

    public String getAcceptedNameUsageId() {
        return acceptedNameUsageId;
    }

    public void setAcceptedNameUsageId(String acceptedNameUsageId) {
        this.acceptedNameUsageId = acceptedNameUsageId;
    }

    public String getParentNameUsageId() {
        return parentNameUsageId;
    }

    public void setParentNameUsageId(String parentNameUsageId) {
        this.parentNameUsageId = parentNameUsageId;
    }

    public String getOriginalNameUsageId() {
        return originalNameUsageId;
    }

    public void setOriginalNameUsageId(String originalNameUsageId) {
        this.originalNameUsageId = originalNameUsageId;
    }

    public String getNameAccordingToId() {
        return nameAccordingToId;
    }

    public void setNameAccordingToId(String nameAccordingToId) {
        this.nameAccordingToId = nameAccordingToId;
    }

    public String getNamePublishedInId() {
        return namePublishedInId;
    }

    public void setNamePublishedInId(String namePublishedInId) {
        this.namePublishedInId = namePublishedInId;
    }

    public String getTaxonConceptId() {
        return taxonConceptId;
    }

    public void setTaxonConceptId(String taxonConceptId) {
        this.taxonConceptId = taxonConceptId;
    }

    public String getScientificname() {
        return scientificname;
    }

    public void setScientificname(String scientificname) {
        this.scientificname = scientificname;
    }

    public String getAcceptednameusage() {
        return acceptednameusage;
    }

    public void setAcceptednameusage(String acceptednameusage) {
        this.acceptednameusage = acceptednameusage;
    }

    public String getParentNameUsage() {
        return parentNameUsage;
    }

    public void setParentNameUsage(String parentNameUsage) {
        this.parentNameUsage = parentNameUsage;
    }

    public String getOriginalNameUsage() {
        return originalNameUsage;
    }

    public void setOriginalNameUsage(String originalNameUsage) {
        this.originalNameUsage = originalNameUsage;
    }

    public String getNameAccordingTo() {
        return nameAccordingTo;
    }

    public void setNameAccordingTo(String nameAccordingTo) {
        this.nameAccordingTo = nameAccordingTo;
    }

    public String getNamePublishedIn() {
        return namePublishedIn;
    }

    public void setNamePublishedIn(String namePublishedIn) {
        this.namePublishedIn = namePublishedIn;
    }

    public String getHigherclassification() {
        return higherclassification;
    }

    public void setHigherclassification(String higherclassification) {
        this.higherclassification = higherclassification;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getDarwinclass() {
        return darwinclass;
    }

    public void setDarwinclass(String darwinclass) {
        this.darwinclass = darwinclass;
    }

    public String getDarwinorder() {
        return darwinorder;
    }

    public void setDarwinorder(String darwinorder) {
        this.darwinorder = darwinorder;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSubgenus() {
        return subgenus;
    }

    public void setSubgenus(String subgenus) {
        this.subgenus = subgenus;
    }

    public String getSpecificepithet() {
        return specificepithet;
    }

    public void setSpecificepithet(String specificepithet) {
        this.specificepithet = specificepithet;
    }

    public String getInfraspecificepithet() {
        return infraspecificepithet;
    }

    public void setInfraspecificepithet(String infraspecificepithet) {
        this.infraspecificepithet = infraspecificepithet;
    }

    public String getTaxonrank() {
        return taxonrank;
    }

    public void setTaxonrank(String taxonrank) {
        this.taxonrank = taxonrank;
    }

    public String getVerbatimtaxonrank() {
        return verbatimtaxonrank;
    }

    public void setVerbatimtaxonrank(String verbatimtaxonrank) {
        this.verbatimtaxonrank = verbatimtaxonrank;
    }

    public String getScientificnameauthorship() {
        return scientificnameauthorship;
    }

    public void setScientificnameauthorship(String scientificnameauthorship) {
        this.scientificnameauthorship = scientificnameauthorship;
    }

    public String getVernacularname() {
        return vernacularname;
    }

    public void setVernacularname(String vernacularname) {
        this.vernacularname = vernacularname;
    }

    public String getNomenclaturalcode() {
        return nomenclaturalcode;
    }

    public void setNomenclaturalcode(String nomenclaturalcode) {
        this.nomenclaturalcode = nomenclaturalcode;
    }

    public String getTaxonomicStatus() {
        return taxonomicStatus;
    }

    public void setTaxonomicStatus(String taxonomicStatus) {
        this.taxonomicStatus = taxonomicStatus;
    }

    public String getNomenclaturalStatus() {
        return nomenclaturalStatus;
    }

    public void setNomenclaturalStatus(String nomenclaturalStatus) {
        this.nomenclaturalStatus = nomenclaturalStatus;
    }

    public String getTaxonremarks() {
        return taxonremarks;
    }

    public void setTaxonremarks(String taxonremarks) {
        this.taxonremarks = taxonremarks;
    }

    public String getOccurrenceId() {
        return occurrenceId;
    }

    public void setOccurrenceId(String occurrenceId) {
        this.occurrenceId = occurrenceId;
    }

    public String getCatalognumber() {
        return catalognumber;
    }

    public void setCatalognumber(String catalognumber) {
        this.catalognumber = catalognumber;
    }

    public String getOccurrenceDetails() {
        return occurrenceDetails;
    }

    public void setOccurrenceDetails(String occurrenceDetails) {
        this.occurrenceDetails = occurrenceDetails;
    }

    public String getOccurrenceremarks() {
        return occurrenceremarks;
    }

    public void setOccurrenceremarks(String occurrenceremarks) {
        this.occurrenceremarks = occurrenceremarks;
    }

    public String getRecordnumber() {
        return recordnumber;
    }

    public void setRecordnumber(String recordnumber) {
        this.recordnumber = recordnumber;
    }

    public String getRecordedby() {
        return recordedby;
    }

    public void setRecordedby(String recordedby) {
        this.recordedby = recordedby;
    }

    public String getIndividualId() {
        return individualId;
    }

    public void setIndividualId(String individualId) {
        this.individualId = individualId;
    }

    public String getIndividualcount() {
        return individualcount;
    }

    public void setIndividualcount(String individualcount) {
        this.individualcount = individualcount;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLifestage() {
        return lifestage;
    }

    public void setLifestage(String lifestage) {
        this.lifestage = lifestage;
    }

    public String getReproductivecondition() {
        return reproductivecondition;
    }

    public void setReproductivecondition(String reproductivecondition) {
        this.reproductivecondition = reproductivecondition;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getEstablishmentMeans() {
        return establishmentMeans;
    }

    public void setEstablishmentMeans(String establishmentMeans) {
        this.establishmentMeans = establishmentMeans;
    }

    public String getOccurrenceStatus() {
        return occurrenceStatus;
    }

    public void setOccurrenceStatus(String occurrenceStatus) {
        this.occurrenceStatus = occurrenceStatus;
    }

    public String getPreparations() {
        return preparations;
    }

    public void setPreparations(String preparations) {
        this.preparations = preparations;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getOthercatalognumbers() {
        return othercatalognumbers;
    }

    public void setOthercatalognumbers(String othercatalognumbers) {
        this.othercatalognumbers = othercatalognumbers;
    }

    public String getPreviousidentifications() {
        return previousidentifications;
    }

    public void setPreviousidentifications(String previousidentifications) {
        this.previousidentifications = previousidentifications;
    }

    public String getAssociatedmedia() {
        return associatedmedia;
    }

    public void setAssociatedmedia(String associatedmedia) {
        this.associatedmedia = associatedmedia;
    }

    public String getAssociatedreferences() {
        return associatedreferences;
    }

    public void setAssociatedreferences(String associatedreferences) {
        this.associatedreferences = associatedreferences;
    }

    public String getAssociatedoccurrences() {
        return associatedoccurrences;
    }

    public void setAssociatedoccurrences(String associatedoccurrences) {
        this.associatedoccurrences = associatedoccurrences;
    }

    public String getAssociatedsequences() {
        return associatedsequences;
    }

    public void setAssociatedsequences(String associatedsequences) {
        this.associatedsequences = associatedsequences;
    }

    public String getAssociatedtaxa() {
        return associatedtaxa;
    }

    public void setAssociatedtaxa(String associatedtaxa) {
        this.associatedtaxa = associatedtaxa;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSamplingprotocol() {
        return samplingprotocol;
    }

    public void setSamplingprotocol(String samplingprotocol) {
        this.samplingprotocol = samplingprotocol;
    }

    public String getSamplingeffort() {
        return samplingeffort;
    }

    public void setSamplingeffort(String samplingeffort) {
        this.samplingeffort = samplingeffort;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventtime() {
        return eventtime;
    }

    public void setEventtime(String eventtime) {
        this.eventtime = eventtime;
    }

    public String getStartdayofyear() {
        return startdayofyear;
    }

    public void setStartdayofyear(String startdayofyear) {
        this.startdayofyear = startdayofyear;
    }

    public String getEnddayofyear() {
        return enddayofyear;
    }

    public void setEnddayofyear(String enddayofyear) {
        this.enddayofyear = enddayofyear;
    }

    public String getDwcyear() {
        return dwcyear;
    }

    public void setDwcyear(String dwcyear) {
        this.dwcyear = dwcyear;
    }

    public String getDwcmonth() {
        return dwcmonth;
    }

    public void setDwcmonth(String dwcmonth) {
        this.dwcmonth = dwcmonth;
    }

    public String getDwcday() {
        return dwcday;
    }

    public void setDwcday(String dwcday) {
        this.dwcday = dwcday;
    }

    public String getVerbatimeventdate() {
        return verbatimeventdate;
    }

    public void setVerbatimeventdate(String verbatimeventdate) {
        this.verbatimeventdate = verbatimeventdate;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getFieldnumber() {
        return fieldnumber;
    }

    public void setFieldnumber(String fieldnumber) {
        this.fieldnumber = fieldnumber;
    }

    public String getFieldnotes() {
        return fieldnotes;
    }

    public void setFieldnotes(String fieldnotes) {
        this.fieldnotes = fieldnotes;
    }

    public String getEventremarks() {
        return eventremarks;
    }

    public void setEventremarks(String eventremarks) {
        this.eventremarks = eventremarks;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getHigherGeographyId() {
        return higherGeographyId;
    }

    public void setHigherGeographyId(String higherGeographyId) {
        this.higherGeographyId = higherGeographyId;
    }

    public String getHighergeography() {
        return highergeography;
    }

    public void setHighergeography(String highergeography) {
        this.highergeography = highergeography;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getWaterbody() {
        return waterbody;
    }

    public void setWaterbody(String waterbody) {
        this.waterbody = waterbody;
    }

    public String getIslandgroup() {
        return islandgroup;
    }

    public void setIslandgroup(String islandgroup) {
        this.islandgroup = islandgroup;
    }

    public String getIsland() {
        return island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getStateprovince() {
        return stateprovince;
    }

    public void setStateprovince(String stateprovince) {
        this.stateprovince = stateprovince;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getVerbatimlocality() {
        return verbatimlocality;
    }

    public void setVerbatimlocality(String verbatimlocality) {
        this.verbatimlocality = verbatimlocality;
    }

    public String getVerbatimelevation() {
        return verbatimelevation;
    }

    public void setVerbatimelevation(String verbatimelevation) {
        this.verbatimelevation = verbatimelevation;
    }

    public String getMinimumelevationinmeters() {
        return minimumelevationinmeters;
    }

    public void setMinimumelevationinmeters(String minimumelevationinmeters) {
        this.minimumelevationinmeters = minimumelevationinmeters;
    }

    public String getMaximumelevationinmeters() {
        return maximumelevationinmeters;
    }

    public void setMaximumelevationinmeters(String maximumelevationinmeters) {
        this.maximumelevationinmeters = maximumelevationinmeters;
    }

    public String getVerbatimdepth() {
        return verbatimdepth;
    }

    public void setVerbatimdepth(String verbatimdepth) {
        this.verbatimdepth = verbatimdepth;
    }

    public String getMinimumdepthinmeters() {
        return minimumdepthinmeters;
    }

    public void setMinimumdepthinmeters(String minimumdepthinmeters) {
        this.minimumdepthinmeters = minimumdepthinmeters;
    }

    public String getMaximumdepthinmeters() {
        return maximumdepthinmeters;
    }

    public void setMaximumdepthinmeters(String maximumdepthinmeters) {
        this.maximumdepthinmeters = maximumdepthinmeters;
    }

    public String getMinimumdistanceabovesurfaceinmeters() {
        return minimumdistanceabovesurfaceinmeters;
    }

    public void setMinimumdistanceabovesurfaceinmeters(String minimumdistanceabovesurfaceinmeters) {
        this.minimumdistanceabovesurfaceinmeters = minimumdistanceabovesurfaceinmeters;
    }

    public String getMaximumdistanceabovesurfaceinmeters() {
        return maximumdistanceabovesurfaceinmeters;
    }

    public void setMaximumdistanceabovesurfaceinmeters(String maximumdistanceabovesurfaceinmeters) {
        this.maximumdistanceabovesurfaceinmeters = maximumdistanceabovesurfaceinmeters;
    }

    public String getLocationaccordingto() {
        return locationaccordingto;
    }

    public void setLocationaccordingto(String locationaccordingto) {
        this.locationaccordingto = locationaccordingto;
    }

    public String getLocationremarks() {
        return locationremarks;
    }

    public void setLocationremarks(String locationremarks) {
        this.locationremarks = locationremarks;
    }

    public String getVerbatimcoordinates() {
        return verbatimcoordinates;
    }

    public void setVerbatimcoordinates(String verbatimcoordinates) {
        this.verbatimcoordinates = verbatimcoordinates;
    }

    public String getVerbatimlatitude() {
        return verbatimlatitude;
    }

    public void setVerbatimlatitude(String verbatimlatitude) {
        this.verbatimlatitude = verbatimlatitude;
    }

    public String getVerbatimlongitude() {
        return verbatimlongitude;
    }

    public void setVerbatimlongitude(String verbatimlongitude) {
        this.verbatimlongitude = verbatimlongitude;
    }

    public String getVerbatimcoordinatesystem() {
        return verbatimcoordinatesystem;
    }

    public void setVerbatimcoordinatesystem(String verbatimcoordinatesystem) {
        this.verbatimcoordinatesystem = verbatimcoordinatesystem;
    }

    public String getVerbatimsrs() {
        return verbatimsrs;
    }

    public void setVerbatimsrs(String verbatimsrs) {
        this.verbatimsrs = verbatimsrs;
    }

    public String getDecimallatitude() {
        return decimallatitude;
    }

    public void setDecimallatitude(String decimallatitude) {
        this.decimallatitude = decimallatitude;
    }

    public String getDecimallongitude() {
        return decimallongitude;
    }

    public void setDecimallongitude(String decimallongitude) {
        this.decimallongitude = decimallongitude;
    }

    public String getGeodeticdatum() {
        return geodeticdatum;
    }

    public void setGeodeticdatum(String geodeticdatum) {
        this.geodeticdatum = geodeticdatum;
    }

    public String getCoordinateuncertaintyinmeters() {
        return coordinateuncertaintyinmeters;
    }

    public void setCoordinateuncertaintyinmeters(String coordinateuncertaintyinmeters) {
        this.coordinateuncertaintyinmeters = coordinateuncertaintyinmeters;
    }

    public String getCoordinateprecision() {
        return coordinateprecision;
    }

    public void setCoordinateprecision(String coordinateprecision) {
        this.coordinateprecision = coordinateprecision;
    }

    public String getPointradiusspatialfit() {
        return pointradiusspatialfit;
    }

    public void setPointradiusspatialfit(String pointradiusspatialfit) {
        this.pointradiusspatialfit = pointradiusspatialfit;
    }

    public String getFootprintwkt() {
        return footprintwkt;
    }

    public void setFootprintwkt(String footprintwkt) {
        this.footprintwkt = footprintwkt;
    }

    public String getFootprintsrs() {
        return footprintsrs;
    }

    public void setFootprintsrs(String footprintsrs) {
        this.footprintsrs = footprintsrs;
    }

    public String getFootprintspatialfit() {
        return footprintspatialfit;
    }

    public void setFootprintspatialfit(String footprintspatialfit) {
        this.footprintspatialfit = footprintspatialfit;
    }

    public String getGeoreferencedby() {
        return georeferencedby;
    }

    public void setGeoreferencedby(String georeferencedby) {
        this.georeferencedby = georeferencedby;
    }

    public String getGeoreferenceprotocol() {
        return georeferenceprotocol;
    }

    public void setGeoreferenceprotocol(String georeferenceprotocol) {
        this.georeferenceprotocol = georeferenceprotocol;
    }

    public String getGeoreferencesources() {
        return georeferencesources;
    }

    public void setGeoreferencesources(String georeferencesources) {
        this.georeferencesources = georeferencesources;
    }

    public String getGeoreferenceverificationstatus() {
        return georeferenceverificationstatus;
    }

    public void setGeoreferenceverificationstatus(String georeferenceverificationstatus) {
        this.georeferenceverificationstatus = georeferenceverificationstatus;
    }

    public String getGeoreferenceremarks() {
        return georeferenceremarks;
    }

    public void setGeoreferenceremarks(String georeferenceremarks) {
        this.georeferenceremarks = georeferenceremarks;
    }

    public String getIdentificationId() {
        return identificationId;
    }

    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId;
    }

    public String getIdentifiedby() {
        return identifiedby;
    }

    public void setIdentifiedby(String identifiedby) {
        this.identifiedby = identifiedby;
    }

    public String getDateidentified() {
        return dateidentified;
    }

    public void setDateidentified(String dateidentified) {
        this.dateidentified = dateidentified;
    }

    public String getIdentificationreferences() {
        return identificationreferences;
    }

    public void setIdentificationreferences(String identificationreferences) {
        this.identificationreferences = identificationreferences;
    }

    public String getIdentificationremarks() {
        return identificationremarks;
    }

    public void setIdentificationremarks(String identificationremarks) {
        this.identificationremarks = identificationremarks;
    }

    public String getIdentificationqualifier() {
        return identificationqualifier;
    }

    public void setIdentificationqualifier(String identificationqualifier) {
        this.identificationqualifier = identificationqualifier;
    }

    public String getTypestatus() {
        return typestatus;
    }

    public void setTypestatus(String typestatus) {
        this.typestatus = typestatus;
    }

    public Integer getIdUtilisateurUpload() {
        return idUtilisateurUpload;
    }

    public void setIdUtilisateurUpload(Integer idUtilisateurUpload) {
        this.idUtilisateurUpload = idUtilisateurUpload;
    }

    public Integer getIdRebioma() {
        return idRebioma;
    }

    public void setIdRebioma(Integer idRebioma) {
        this.idRebioma = idRebioma;
    }

    public void setIdRebiomaString(String idRebioma) {
        this.idRebioma = Integer.getInteger(idRebioma);
        idRebioma = idRebioma.replace(" ", "");
        this.idRebioma = Integer.decode(idRebioma);
    }

    public String getLienSource() {
        return lienSource;
    }

    public void setLienSource(String lienSource) {
        this.lienSource = lienSource;
    }

    public String getValidated() {
        return validated;
    }

    public void setValidated(String validated) {
        this.validated = validated;
    }

    public String getReviewed() {
        return reviewed;
    }

    public void setReviewed(String reviewed) {
        this.reviewed = reviewed;
    }

    public Boolean getPublique() {
        return publique;
    }

    public void setPublique(Boolean publique) {
        this.publique = publique;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}    
    
    
    
}
