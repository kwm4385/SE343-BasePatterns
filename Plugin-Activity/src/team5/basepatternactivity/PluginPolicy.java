
package team5.basepatternactivity;

import java.security.AllPermission;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;

public class PluginPolicy extends Policy {

	/**
	 * Returns {@link AllPermission} for any code sources that do not end in
	 * "/rogue.jar" and an empty set of permissions for code sources that do end
	 * in "/rogue.jar", denying access to all local resources to the rogue
	 * plugin.
	 * 
	 * @param codeSource
	 *            The code source to get the permissiosn for
	 * @return The permissions for the given code source
	 */
	public PermissionCollection getPermissions(CodeSource codeSource) {
		Permissions p = new Permissions();
		if (!codeSource.getLocation().toString().endsWith("/rogue.jar")) {
			p.add(new AllPermission());
		}
		return p;
	}

	public void refresh() {
	}

}
