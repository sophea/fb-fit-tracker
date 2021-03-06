package com.wadpam.tracker.dao;

import com.google.appengine.api.blobstore.BlobKey;
import com.wadpam.tracker.domain.TrackPoint;
import java.util.Date;
import java.util.List;

/**
 * Business Methods interface for entity DRace.
 * This interface is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 *
 * Generated on 2014-01-24T20:26:57.207+0100.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface DRaceDao extends GeneratedDRaceDao {
    String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    TrackPoint findNearest(Object raceKey, long minTimestamp, Float lat, Float lon);

    List<TrackPoint> getTrack(BlobKey blobKey);

    Iterable<Long> queryActive(Date now);

}
