/*
 * Roughly Enough Items by Danielshe.
 * Licensed under the MIT License.
 */

package me.shedaniel.rei.api;

import me.shedaniel.rei.client.ConfigObject;
import net.minecraft.client.gui.Screen;

import java.io.IOException;

public interface ConfigManager {
    
    /**
     * Saves the config.
     *
     * @throws IOException when error
     */
    void saveConfig() throws IOException;
    
    /**
     * Loads the config from the json file, creates the file if not found.
     *
     * @throws IOException when error
     */
    void loadConfig() throws IOException;
    
    /**
     * Gets the config instance
     *
     * @return the config instance
     */
    ConfigObject getConfig();
    
    /**
     * Gets if craftable only filter is enabled
     *
     * @return whether craftable only filter is enabled
     */
    boolean isCraftableOnlyEnabled();
    
    /**
     * Toggles the craftable only filter
     */
    void toggleCraftableOnly();
    
    /**
     * Opens the config screen
     *
     * @param parent the screen shown before
     */
    void openConfigScreen(Screen parent);
    
    /**
     * Gets the config screen
     *
     * @param parent the screen shown before
     * @return the config screen
     */
    Screen getConfigScreen(Screen parent);
    
}
