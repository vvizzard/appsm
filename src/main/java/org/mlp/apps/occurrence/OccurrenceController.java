package org.mlp.apps.occurrence;

import java.util.List;
import org.mlp.apps.species.Species;
import org.mlp.apps.species.SpeciesRepository;
import org.mlp.apps.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class OccurrenceController {
	
	@Autowired
	private OccurrenceRepository occurrenceRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OccurrenceSaveRepository occurrenceSaveRepository;
	
	@Autowired
	private OccurrenceValidationRepository occurrenceValidationRepository;
	
	@Autowired
	private SpeciesRepository speciesRepository;
	
	@GetMapping("/public/observations")
	public List<Occurrence> getAllSpecies(@RequestParam(required = false, 
			value = "page") Integer page, @RequestParam(required=false, 
			value="limite") Integer limite) {
		Occurrence oc = new Occurrence();
		oc.setPublique(Boolean.TRUE);
		oc.setValidationexpert(1);
		if(page != null && limite != null && page>= 1 && limite > 0) {
			Pageable pageable = PageRequest.of(page - 1, limite);
			return occurrenceRepository.findAll(Example.of(oc), pageable)
					.getContent();
		}
		return occurrenceRepository.findAll(Example.of(oc));
	}
	
	@GetMapping("/user/myobservations")
	public List<Occurrence> getAllMySpecies(@RequestParam(required = false, 
			value = "page") Integer page, @RequestParam(required=false, 
			value="limite") Integer limite, @RequestParam(name = "token", 
			required = false) String token) {
		Occurrence oc = new Occurrence();
		if(token == null) {
			return null;
		} else {
			oc.setIdUtilisateurUpload(Integer.parseInt(
	        		token.substring(token.indexOf(",.5")+3)));
		}
		if(page != null && limite != null && page>= 1 && limite > 0) {
			Pageable pageable = PageRequest.of(page - 1, limite);
			return occurrenceRepository.findAll(Example.of(oc), pageable)
					.getContent();
		}
		return occurrenceRepository.findAll(Example.of(oc));
	}
	
	@GetMapping("/public/observation/{id}")
	public Occurrence getOne(@PathVariable Integer id) {
		Occurrence temp = new Occurrence();
		temp.setId(id);
		temp.setPublique(true);
		List<Occurrence> val =  occurrenceRepository.findAll(Example.of(temp));
		if (!val.isEmpty()) {
			return val.get(0);
		} else return null;
	}
	
	@PostMapping("user/observation")
	public Boolean addObs(@RequestParam(name = "id", required = false) Integer id,
			@RequestParam(name = "institutioncode", required = false) String institutioncode,
			@RequestParam(name = "collectioncode", required = false) String collectioncode,
		    @RequestParam(name = "datasetname", required = false) String datasetname,
		    @RequestParam(name = "ownerinstitutioncode", required = false) String ownerinstitutioncode,
		    @RequestParam(name = "basisofrecord", required = false) String basisofrecord,
		    @RequestParam(name = "informationwithheld", required = false) String informationwithheld,
		    @RequestParam(name = "datageneralizations", required = false) String datageneralizations,
		    @RequestParam(name = "dynamicproperties", required = false) String dynamicproperties,
		    @RequestParam(name = "taxonId", required = false) String taxonId,
		    @RequestParam(name = "scientificNameId", required = false) String scientificNameId,
		    @RequestParam(name = "acceptedNameUsageId", required = false) String acceptedNameUsageId,
		    @RequestParam(name = "acceptedNameUsageId", required = false) String parentNameUsageId,
		    @RequestParam(name = "originalNameUsageId", required = false) String originalNameUsageId,
		    @RequestParam(name = "nameAccordingToId", required = false) String nameAccordingToId,
		    @RequestParam(name = "namePublishedInId", required = false) String namePublishedInId,
		    @RequestParam(name = "taxonConceptId", required = false) String taxonConceptId,
		    @RequestParam(name = "scientificname", required = false) String scientificname,
		    @RequestParam(name = "acceptednameusage", required = false) String acceptednameusage,
		    @RequestParam(name = "parentNameUsage", required = false) String parentNameUsage,
		    @RequestParam(name = "originalNameUsage", required = false) String originalNameUsage,
		    @RequestParam(name = "nameAccordingTo", required = false) String nameAccordingTo,
		    @RequestParam(name = "namePublishedIn", required = false) String namePublishedIn,
		    @RequestParam(name = "higherclassification", required = false) String higherclassification,
		    @RequestParam(name = "kingdom", required = false) String kingdom,
		    @RequestParam(name = "phylum", required = false) String phylum,
		    @RequestParam(name = "darwinclass", required = false) String darwinclass,
		    @RequestParam(name = "darwinorder", required = false) String darwinorder,
		    @RequestParam(name = "family", required = false) String family,
		    @RequestParam(name = "genus", required = false) String genus,
		    @RequestParam(name = "subgenus", required = false) String subgenus,
		    @RequestParam(name = "specificepithet", required = false) String specificepithet,
		    @RequestParam(name = "infraspecificepithet", required = false) String infraspecificepithet,
		    @RequestParam(name = "taxonrank", required = false) String taxonrank,
		    @RequestParam(name = "verbatimtaxonrank", required = false) String verbatimtaxonrank,
		    @RequestParam(name = "scientificnameauthorship", required = false) String scientificnameauthorship,
		    @RequestParam(name = "vernacularname", required = false) String vernacularname,
		    @RequestParam(name = "nomenclaturalcode", required = false) String nomenclaturalcode,
		    @RequestParam(name = "taxonomicStatus", required = false) String taxonomicStatus,
		    @RequestParam(name = "nomenclaturalStatus", required = false) String nomenclaturalStatus,
		    @RequestParam(name = "taxonremarks", required = false) String taxonremarks,
		    @RequestParam(name = "occurrenceId", required = false) String occurrenceId,
		    @RequestParam(name = "catalognumber", required = false) String catalognumber,
		    @RequestParam(name = "occurrenceDetails", required = false) String occurrenceDetails,
		    @RequestParam(name = "occurrenceremarks", required = false) String occurrenceremarks,
		    @RequestParam(name = "recordnumber", required = false) String recordnumber,
		    @RequestParam(name = "recordedby", required = false) String recordedby,
		    @RequestParam(name = "individualId", required = false) String individualId,
		    @RequestParam(name = "individualcount", required = false) String individualcount,
		    @RequestParam(name = "sex", required = false) String sex,
		    @RequestParam(name = "lifestage", required = false) String lifestage,
		    @RequestParam(name = "reproductivecondition", required = false) String reproductivecondition,
		    @RequestParam(name = "behavior", required = false) String behavior,
		    @RequestParam(name = "establishmentMeans", required = false) String establishmentMeans,
		    @RequestParam(name = "occurrenceStatus", required = false) String occurrenceStatus,
		    @RequestParam(name = "preparations", required = false) String preparations,
		    @RequestParam(name = "disposition", required = false) String disposition,
		    @RequestParam(name = "othercatalognumbers", required = false) String othercatalognumbers,
		    @RequestParam(name = "previousidentifications", required = false) String previousidentifications,
		    @RequestParam(name = "associatedmedia", required = false) String associatedmedia,
		    @RequestParam(name = "associatedreferences", required = false) String associatedreferences,
		    @RequestParam(name = "associatedoccurrences", required = false) String associatedoccurrences,
		    @RequestParam(name = "associatedsequences", required = false) String associatedsequences,
		    @RequestParam(name = "associatedtaxa", required = false) String associatedtaxa,
		    @RequestParam(name = "eventId", required = false) String eventId,
		    @RequestParam(name = "samplingprotocol", required = false) String samplingprotocol,
		    @RequestParam(name = "samplingeffort", required = false) String samplingeffort,
		    @RequestParam(name = "eventdate", required = false) String eventdate,
		    @RequestParam(name = "eventtime", required = false) String eventtime,
		    @RequestParam(name = "startdayofyear", required = false) String startdayofyear,
		    @RequestParam(name = "enddayofyear", required = false) String enddayofyear,
		    @RequestParam(name = "dwcyear", required = false) String dwcyear,
		    @RequestParam(name = "dwcmonth", required = false) String dwcmonth,
		    @RequestParam(name = "dwcday", required = false) String dwcday,
		    @RequestParam(name = "verbatimeventdate", required = false) String verbatimeventdate,
		    @RequestParam(name = "habitat", required = false) String habitat,
		    @RequestParam(name = "fieldnumber", required = false) String fieldnumber,
		    @RequestParam(name = "fieldnotes", required = false) String fieldnotes,
		    @RequestParam(name = "eventremarks", required = false) String eventremarks,
		    @RequestParam(name = "locationId", required = false) String locationId,
		    @RequestParam(name = "higherGeographyId", required = false) String higherGeographyId,
		    @RequestParam(name = "highergeography", required = false) String highergeography,
		    @RequestParam(name = "continent", required = false) String continent,
		    @RequestParam(name = "waterbody", required = false) String waterbody,
		    @RequestParam(name = "islandgroup", required = false) String islandgroup,
		    @RequestParam(name = "island", required = false) String island,
		    @RequestParam(name = "country", required = false) String country,
		    @RequestParam(name = "countrycode", required = false) String countrycode,
		    @RequestParam(name = "stateprovince", required = false) String stateprovince,
		    @RequestParam(name = "county", required = false) String county,
		    @RequestParam(name = "municipality", required = false) String municipality,
		    @RequestParam(name = "locality", required = false) String locality,
		    @RequestParam(name = "verbatimlocality", required = false) String verbatimlocality,
		    @RequestParam(name = "verbatimelevation", required = false) String verbatimelevation,
		    @RequestParam(name = "minimumelevationinmeters", required = false) String minimumelevationinmeters,
		    @RequestParam(name = "maximumelevationinmeters", required = false) String maximumelevationinmeters,
		    @RequestParam(name = "verbatimdepth", required = false) String verbatimdepth,
		    @RequestParam(name = "minimumdepthinmeters", required = false) String minimumdepthinmeters,
		    @RequestParam(name = "maximumdepthinmeters", required = false) String maximumdepthinmeters,
		    @RequestParam(name = "minimumdistanceabovesurfaceinmeters", required = false) String minimumdistanceabovesurfaceinmeters,
		    @RequestParam(name = "maximumdistanceabovesurfaceinmeters", required = false) String maximumdistanceabovesurfaceinmeters,
		    @RequestParam(name = "locationaccordingto", required = false) String locationaccordingto,
		    @RequestParam(name = "locationremarks", required = false) String locationremarks,
		    @RequestParam(name = "verbatimcoordinates", required = false) String verbatimcoordinates,
		    @RequestParam(name = "verbatimlatitude", required = false) String verbatimlatitude,
		    @RequestParam(name = "verbatimlongitude", required = false) String verbatimlongitude,
		    @RequestParam(name = "verbatimcoordinatesystem", required = false) String verbatimcoordinatesystem,
		    @RequestParam(name = "verbatimsrs", required = false) String verbatimsrs,
		    @RequestParam(name = "decimallatitude", required = false) String decimallatitude,
		    @RequestParam(name = "decimallongitude", required = false) String decimallongitude,
		    @RequestParam(name = "geodeticdatum", required = false) String geodeticdatum,
		    @RequestParam(name = "coordinateuncertaintyinmeters", required = false) String coordinateuncertaintyinmeters,
		    @RequestParam(name = "coordinateprecision", required = false) String coordinateprecision,
		    @RequestParam(name = "pointradiusspatialfit", required = false) String pointradiusspatialfit,
		    @RequestParam(name = "footprintwkt", required = false) String footprintwkt,
		    @RequestParam(name = "footprintsrs", required = false) String footprintsrs,
		    @RequestParam(name = "footprintspatialfit", required = false) String footprintspatialfit,
		    @RequestParam(name = "georeferencedby", required = false) String georeferencedby,
		    @RequestParam(name = "georeferenceprotocol", required = false) String georeferenceprotocol,
		    @RequestParam(name = "georeferencesources", required = false) String georeferencesources,
		    @RequestParam(name = "georeferenceverificationstatus", required = false) String georeferenceverificationstatus,
		    @RequestParam(name = "georeferenceremarks", required = false) String georeferenceremarks,
		    @RequestParam(name = "identificationId", required = false) String identificationId,
		    @RequestParam(name = "identifiedby", required = false) String identifiedby,
		    @RequestParam(name = "dateidentified", required = false) String dateidentified,
		    @RequestParam(name = "identificationreferences", required = false) String identificationreferences,
		    @RequestParam(name = "identificationremarks", required = false) String identificationremarks,
		    @RequestParam(name = "identificationqualifier", required = false) String identificationqualifier,
		    @RequestParam(name = "typestatus", required = false) String typestatus,
		    @RequestParam(name = "token", required = false) String token,
		    @RequestParam(name = "idRebioma", required = false) Integer idRebioma,
		    @RequestParam(name = "lienSource", required = false) String lienSource,
		    @RequestParam(name = "validated", required = false) String validated,
		    @RequestParam(name = "reviewed", required = false) String reviewed,
		    @RequestParam(name = "publique", required = false) Boolean publique) {
		Boolean valiny = false;
		
		OccurrenceSave os = new OccurrenceSave();
		
		if( id != null) {
			os = occurrenceSaveRepository.findById(id).get();
			if(os.getIdUtilisateurUpload()!=Integer.parseInt(
	        		token.substring(token.indexOf(",.5")+3))) {
				return false;
			}
		}
		if( institutioncode != null) os.setInstitutioncode( institutioncode);
		if( collectioncode != null) os.setCollectioncode( collectioncode);
	    if( datasetname != null) os.setDatasetname( datasetname);
	    if( ownerinstitutioncode != null) os.setOwnerinstitutioncode( ownerinstitutioncode);
	    if( basisofrecord != null) os.setBasisofrecord( basisofrecord);
	    if( informationwithheld != null) os.setInformationwithheld( informationwithheld);
	    if( datageneralizations != null) os.setDatageneralizations( datageneralizations);
	    if( dynamicproperties != null) os.setDynamicproperties( dynamicproperties);
	    if( taxonId != null) os.setTaxonId(taxonId);
	    if( scientificNameId != null) os.setScientificNameId( scientificNameId);
	    if( acceptedNameUsageId != null) os.setAcceptedNameUsageId( acceptedNameUsageId);
	    if( parentNameUsageId != null) os.setParentNameUsageId( parentNameUsageId);
	    if( originalNameUsageId != null) os.setOriginalNameUsageId( originalNameUsageId);
	    if( nameAccordingToId != null) os.setNameAccordingToId(nameAccordingToId );
	    if( namePublishedInId != null) os.setNamePublishedInId( namePublishedInId);
	    if( taxonConceptId != null) os.setTaxonConceptId(taxonConceptId );
	    if( scientificname != null) os.setScientificname(scientificname );
	    if( acceptednameusage != null) os.setAcceptednameusage(acceptednameusage );
	    if( parentNameUsage != null) os.setParentNameUsage(parentNameUsage );
	    if( originalNameUsage != null) os.setOriginalNameUsage(originalNameUsage );
	    if( nameAccordingTo != null) os.setNameAccordingTo(nameAccordingTo  );
	    if( namePublishedIn != null) os.setNamePublishedIn(namePublishedIn );
	    if( higherclassification != null) os.setHigherclassification( higherclassification);
	    if( kingdom != null) os.setKingdom(kingdom );
	    if( phylum != null) os.setPhylum(phylum );
	    if( darwinclass != null) os.setDarwinclass(darwinclass  );
	    if( darwinorder != null) os.setDarwinorder(darwinorder );
	    if( family != null) os.setFamily(family );
	    if( genus != null) os.setGenus( genus);
	    if( subgenus != null) os.setSubgenus(subgenus );
	    if( specificepithet != null) os.setSpecificepithet(specificepithet );
	    if( infraspecificepithet != null) os.setInfraspecificepithet(infraspecificepithet  );
	    if( taxonrank != null) os.setTaxonrank(taxonrank );
	    if( verbatimtaxonrank != null) os.setVerbatimtaxonrank(verbatimtaxonrank );
	    if( scientificnameauthorship != null) os.setScientificnameauthorship(scientificnameauthorship );
	    if( vernacularname != null) os.setVernacularname(vernacularname );
	    if( nomenclaturalcode != null) os.setNomenclaturalcode(nomenclaturalcode );
	    if( taxonomicStatus != null) os.setTaxonomicStatus(taxonomicStatus );
	    if( nomenclaturalStatus != null) os.setNomenclaturalStatus(nomenclaturalStatus );
	    if( taxonremarks != null) os.setTaxonremarks(taxonremarks );
	    if( occurrenceId != null) os.setOccurrenceId(occurrenceId );
	    if( catalognumber != null) os.setCatalognumber(catalognumber );
	    if( occurrenceDetails != null) os.setOccurrenceDetails(occurrenceDetails );
	    if( occurrenceremarks != null) os.setOccurrenceremarks( occurrenceremarks);
	    if( recordnumber != null) os.setRecordnumber(recordnumber );
	    if( recordedby != null) os.setRecordedby( recordedby);
	    if( individualId != null) os.setIndividualId(individualId );
	    if( individualcount != null) os.setIndividualcount(individualcount );
	    if( sex != null) os.setSex(sex );
	    if( lifestage != null) os.setLifestage(lifestage );
	    if( reproductivecondition != null) os.setReproductivecondition(lifestage );
	    if( behavior != null) os.setBehavior(behavior );
	    if( establishmentMeans != null) os.setEstablishmentMeans(establishmentMeans );
	    if( occurrenceStatus != null) os.setOccurrenceStatus(occurrenceStatus );
	    if( preparations != null) os.setPreparations( preparations);
	    if( disposition != null) os.setDisposition(disposition );
	    if( othercatalognumbers != null) os.setOthercatalognumbers( othercatalognumbers);
	    if( previousidentifications != null) os.setPreviousidentifications(previousidentifications );
	    if( associatedmedia != null) os.setAssociatedmedia(associatedmedia );
	    if( associatedreferences != null) os.setAssociatedreferences( associatedreferences);
	    if( associatedoccurrences != null) os.setAssociatedoccurrences( associatedoccurrences);
	    if( associatedsequences != null) os.setAssociatedsequences(associatedsequences );
	    if( associatedtaxa != null) os.setAssociatedtaxa(associatedtaxa );
	    if( eventId != null) os.setEventId(eventId);
	    if( samplingprotocol != null) os.setSamplingprotocol(samplingprotocol);
	    if( samplingeffort != null) os.setSamplingeffort(samplingeffort);
	    if( eventdate != null) os.setEventdate(eventdate );
	    if( eventtime != null) os.setEventtime( eventtime);
	    if( startdayofyear != null) os.setStartdayofyear(startdayofyear );
	    if( enddayofyear != null) os.setEnddayofyear(enddayofyear );
	    if( dwcyear != null) os.setDwcyear(dwcyear );
	    if( dwcmonth != null) os.setDwcmonth(dwcmonth );
	    if( dwcday != null) os.setDwcday(dwcday );
	    if( verbatimeventdate != null) os.setVerbatimeventdate(verbatimeventdate );
	    if( habitat != null) os.setHabitat(habitat );
	    if( fieldnumber != null) os.setFieldnumber(fieldnumber );
	    if( fieldnotes != null) os.setFieldnotes( fieldnotes);
	    if( eventremarks != null) os.setEventremarks(eventremarks );
	    if( locationId != null) os.setLocationId(locationId );
	    if( higherGeographyId != null) os.setHigherGeographyId(higherGeographyId  );
	    if( highergeography != null) os.setHighergeography(highergeography );
	    if( continent != null) os.setContinent(continent );
	    if( waterbody != null) os.setWaterbody(waterbody );
	    if( islandgroup != null) os.setIslandgroup(islandgroup );
	    if( island != null) os.setIsland( island);
	    if( country != null) os.setCountry(country );
	    if( countrycode != null) os.setCountrycode( countrycode);
	    if( stateprovince != null) os.setStateprovince( stateprovince);
	    if( county != null) os.setCounty(county );
	    if( municipality != null) os.setMunicipality( municipality);
	    if( locality != null) os.setLocality(locality );
	    if( verbatimlocality != null) os.setVerbatimlocality( locality);
	    if( verbatimelevation != null) os.setVerbatimelevation(verbatimelevation );
	    if( minimumelevationinmeters != null) os.setMinimumelevationinmeters( minimumelevationinmeters);
	    if( maximumelevationinmeters != null) os.setMaximumelevationinmeters(maximumelevationinmeters );
	    if( verbatimdepth != null) os.setVerbatimdepth(verbatimdepth );
	    if( minimumdepthinmeters != null) os.setMinimumdepthinmeters(minimumdepthinmeters );
	    if( maximumdepthinmeters != null) os.setMaximumdepthinmeters(maximumdepthinmeters );
	    if( minimumdistanceabovesurfaceinmeters != null) os.setMinimumdistanceabovesurfaceinmeters(minimumdistanceabovesurfaceinmeters );
	    if( maximumdistanceabovesurfaceinmeters != null) os.setMaximumdistanceabovesurfaceinmeters(maximumdistanceabovesurfaceinmeters );
	    if( locationaccordingto != null) os.setLocationaccordingto( locationaccordingto);
	    if( locationremarks != null) os.setLocationremarks(locationremarks );
	    if( verbatimcoordinates != null) os.setVerbatimcoordinates(verbatimcoordinates );
	    if( verbatimlatitude != null) os.setVerbatimlatitude(verbatimlatitude );
	    if( verbatimlongitude != null) os.setVerbatimlongitude(verbatimlongitude );
	    if( verbatimcoordinatesystem != null) os.setVerbatimcoordinatesystem(verbatimcoordinatesystem );
	    if( verbatimsrs != null) os.setVerbatimsrs(verbatimsrs );
	    if( decimallatitude != null) os.setDecimallatitude(decimallatitude );
	    if( decimallongitude != null) os.setDecimallongitude( decimallongitude);
	    if( geodeticdatum != null) os.setGeodeticdatum(geodeticdatum );
	    if( coordinateuncertaintyinmeters != null) os.setCoordinateuncertaintyinmeters(coordinateuncertaintyinmeters );
	    if( coordinateprecision != null) os.setCoordinateprecision(coordinateprecision );
	    if( pointradiusspatialfit != null) os.setPointradiusspatialfit(pointradiusspatialfit );
	    if( footprintwkt != null) os.setFootprintwkt( footprintwkt);
	    if( footprintsrs != null) os.setFootprintsrs( footprintsrs);
	    if( footprintspatialfit != null) os.setFootprintspatialfit( footprintspatialfit);
	    if( georeferencedby != null) os.setGeoreferencedby(georeferencedby );
	    if( georeferenceprotocol != null) os.setGeoreferenceprotocol( georeferenceprotocol);
	    if( georeferencesources != null) os.setGeoreferencesources(georeferencesources );
	    if( georeferenceverificationstatus != null) os.setGeoreferenceverificationstatus(georeferenceverificationstatus );
	    if( georeferenceremarks != null) os.setGeoreferenceremarks(georeferenceremarks );
	    if( identificationId != null) os.setIdentificationId( identificationId);
	    if( identifiedby != null) os.setIdentifiedby(identifiedby );
	    if( dateidentified != null) os.setDateidentified( dateidentified);
	    if( identificationreferences != null) os.setIdentificationreferences(identificationreferences );
	    if( identificationremarks != null) os.setIdentificationremarks(identificationremarks );
	    if( identificationqualifier != null) os.setIdentificationqualifier(identificationqualifier );
	    if( typestatus != null) os.setTypestatus(typestatus );
	    if( token == null) return false;
	    else {
	    	try {
	    		os.setIdUtilisateurUpload(userRepository.findById(Integer.parseInt(
	        		token.substring(token.indexOf(",.5")+3))).get().getId());
	    	} catch(IllegalArgumentException|NullPointerException ex) {
	    		return false;
	    	}
	    }
	    if( idRebioma != null) os.setIdRebioma( idRebioma);
	    if( lienSource != null) os.setLienSource(lienSource );
	    if( validated != null) os.setValidated(validated );
	    if( reviewed != null) os.setReviewed(reviewed );
	    if( publique != null) os.setPublique(publique );
		
	    OccurrenceValidation ov = new OccurrenceValidation();
	    if(id != null) {
	    	ov.setIdDarwinCore(id);
	    	List<OccurrenceValidation> tempOv = occurrenceValidationRepository.findAll(Example.of(ov));
	    	if(tempOv != null && !tempOv.isEmpty()) {
	    		ov.setId(tempOv.get(0).getId());
	    	}
	    }
	    
	    if(os.getRecordedby() == null || os.getRecordedby().isEmpty()) {
	    	ov.setCollecteur(false);
	    } else {
	    	ov.setCollecteur(true);
	    }
	    if(os.getDwcyear() == null || os.getDwcyear().isEmpty()) {
	    	ov.setAnnee(false);
	    } else {
	    	ov.setAnnee(true);
	    }
	    if(os.getDecimallatitude() == null || os.getDecimallatitude().isEmpty()
	    		|| os.getDecimallongitude() == null || os.getDecimallongitude()
	    				.isEmpty()) {
	    	ov.setGps(false);
	    } else {
	    	ov.setGps(true);
	    }
	    
	    os = occurrenceSaveRepository.save(os);
	    
	    Species species = new Species();
	    species.setScientificname(os.getScientificname());
	    List<Species> forTest = speciesRepository.findAll(Example.of(species));
	    if (forTest != null && !forTest.isEmpty()) {
	    	ov.setAcceptedSpeces(true);
	    } else {
	    	ov.setAcceptedSpeces(false);
	    }
	    
	    ov.setIdDarwinCore(os.getId());
	    ov.setValidationExpert(-1);
	    ov = occurrenceValidationRepository.save(ov);
	    
	    valiny = true;
	    
		return valiny;
	}
}
