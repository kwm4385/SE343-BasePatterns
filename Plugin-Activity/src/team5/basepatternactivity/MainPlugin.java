
package team5.basepatternactivity;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.Policy;

public class MainPlugin {

	public static void main(String[] arguments) throws Throwable {
		new MainPlugin();
	}

	/**
	 * Main program. Sets the Policy, installs a SecurityManager and then loads
	 * the two plugins and executes them.
	 */
	public MainPlugin() throws Throwable {
		Policy.setPolicy(new PluginPolicy());
		System.setSecurityManager(new SecurityManager());

		File authorizedJarFile = new File("authorized.jar");
		ClassLoader authorizedLoader = URLClassLoader.newInstance(new URL[] { authorizedJarFile.toURI().toURL() });
		Plugin authorizedPlugin = (Plugin) authorizedLoader.loadClass("Authorized").newInstance();
		authorizedPlugin.run();

		File unauthorizedJarFile = new File("rogue.jar");
		ClassLoader unauthorizedLoader = URLClassLoader.newInstance(new URL[] { unauthorizedJarFile.toURI().toURL() });
		Plugin unauthorizedPlugin = (Plugin) unauthorizedLoader.loadClass("Rogue").newInstance();
		unauthorizedPlugin.run();
	}

}
