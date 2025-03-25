/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.prefs.Preferences;

/**
 *
 * @author USER
 */
public class SessionManager {

    private static final String USER_ID_KEY = "loggedInUserId";
    private static final Preferences prefs = Preferences.userNodeForPackage(SessionManager.class);

    public static void setLoggedInUserId(int userId) {
        if (userId > -1) {
            prefs.putInt(USER_ID_KEY, userId);
            System.out.println("Session set: " + userId);
        }
    }

    public static int getLoggedInUserId() {
        return prefs.getInt(USER_ID_KEY, -1);
    }

    public static void clearSession() {
        prefs.remove(USER_ID_KEY);
        System.out.println("🟥 Session Cleared!");
    }
}
