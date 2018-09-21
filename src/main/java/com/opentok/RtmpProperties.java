/**
 * OpenTok Java SDK
 * Copyright (C) 2018 TokBox, Inc.
 * http://www.tokbox.com
 *
 * Licensed under The MIT License (MIT). See LICENSE file for more information.
 */
package com.opentok;


/**
 * Defines values for the <code>BroadcastProperties</code> parameter of the
 * {@link OpenTok#startBroadcast(String, BroadcastProperties)}
 *
 * @see OpenTok#startBroadcast(String, BroadcastProperties) 
 */
public class RtmpProperties {
    private String id = null;
    private String serverUrl = null;
    private String streamName = null;

    private RtmpProperties(RtmpProperties.Builder builder) {
        this.id = builder.id;
        this.serverUrl = builder.serverUrl;
        this.streamName = builder.streamName;
    }
    /**
     * Use this class to create a RtmpProperties object.
     *
     * @see RtmpProperties
     */
    public static class Builder {
        private String id = null;
        private String serverUrl = null;
        private String streamName = null;

        /**
         * Call this method to set a type of the signal.
         *
         * @param id The stream ID
         *
         * @return The RtmpProperties.Builder object with the id setting.
         */
        public RtmpProperties.Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Call this method to set the RTMP server URL.
         *
         * @param serverUrl The RTMP server URL
         *
         * @return The RtmpProperties.Builder object with the the RTMP server URL setting.
         */
        public RtmpProperties.Builder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        /**
         * Call this method to set the stream name, such as the YouTube Live stream name or the Facebook stream key.
         *
         * @param streamName The stream name
         *
         * @return The RtmpProperties.Builder object with the stream name setting.
         */
        public RtmpProperties.Builder streamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        /**
         * Builds the RtmpProperties object.
         *
         * @return The RtmpProperties object.
         */
        public RtmpProperties build() {
            return new RtmpProperties(this);
        }
    }
    /**
     * Returns the id of the broadcast stream
     */
    public String id() {
        return id;
    }
    /**
     *   Returns the rtmp server url of the broadcast stream
     */
    public String serverUrl() {
        return serverUrl;
    }

    /**
     *   Returns the stream name of the broadcast, such as the YouTube Live stream name or the Facebook stream key.
     */
    public String streamName() {
        return streamName;
    }
}


