package nl.futureedge.sonar.plugin.rci;

import org.junit.Assert;
import org.junit.Test;
import org.sonar.api.Plugin;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;

public class RciPluginTest {

	@Test
	public void test() {
		final RciPlugin javaPlugin = new RciPlugin();
		final SonarRuntime runtime = SonarRuntimeImpl.forSonarQube(Version.create(5, 6), SonarQubeSide.SERVER);
		final Plugin.Context context = new Plugin.Context(runtime);

		Assert.assertEquals(0, context.getExtensions().size());
		javaPlugin.define(context);
		Assert.assertEquals(7, context.getExtensions().size());
	}

}
