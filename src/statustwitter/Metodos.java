/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statustwitter;

import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author dcuerdogarcia
 */
public class Metodos {

    public Metodos() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("Ako7UjY3M9qkf0yRlbgW31D3h")
                .setOAuthConsumerSecret("WJ3GGGvYyUoSnV0Ag7RwDz8isExrcxNWNZZTozzTSnM2X1dXe4")
                .setOAuthAccessToken("403449991-2vwfIjdgGOqQcHndqWRwJ8PHxLdHmV3LXYerlmH5")
                .setOAuthAccessTokenSecret("zrQRIj6NDy9a7O1C1NUTvfbLdSvvl1fEPylZcCLDeqScw");
    }
    
}
