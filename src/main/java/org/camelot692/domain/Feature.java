package org.camelot692.domain;

import static java.util.Objects.isNull;

public enum Feature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHINDTHE_SCENES("Behind the Scenes");

    private final String value;
    Feature(String value) {
        this.value = value;
    }

    public String getValue() { return value; }

    public static Feature getFeatureByValue(String value) {
        if (isNull(value) || value.isEmpty()){
            return null;
        }
        Feature[] features = Feature.values();
        for (Feature feature : Feature.values()) {
            if (feature.value.equals(value)){
                return feature;
            }
        }
        return null;
    }
}
