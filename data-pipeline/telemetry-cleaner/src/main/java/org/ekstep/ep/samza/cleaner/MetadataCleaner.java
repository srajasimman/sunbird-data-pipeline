package org.ekstep.ep.samza.cleaner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static java.text.MessageFormat.format;

public class MetadataCleaner implements Cleaner {
    private static final String TAG = MetadataCleaner.class.getSimpleName();
    static Logger LOGGER = LoggerFactory.getLogger(MetadataCleaner.class);

    @Override
    public void clean(Map<String, Object> map) {
        map.remove("metadata");
        map.remove("flags");
        map.remove("ready_to_index");

        LOGGER.debug(format("{0} CLEANED METADATA & FLAGS {1}", TAG , map));
    }
}