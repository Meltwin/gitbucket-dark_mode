
import io.github.meltwin.darkbucket.controller.DarkBucketController
import gitbucket.core.controller.Context
import gitbucket.core.plugin.Link
import gitbucket.core.service.RepositoryService.RepositoryInfo
import io.github.gitbucket.solidbase.model.Version
import gitbucket.core.plugin.PluginRegistry
import gitbucket.core.service.SystemSettingsService.SystemSettings
import io.github.meltwin.darkbucket.controller.DarkBucketController
import javax.servlet.ServletContext

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "darkbucket"

  override val pluginName: String = "Innodura TB DarkBucket"

  override val description: String = "Dark Mode for InnoduraTB"

  override val versions: Seq[Version] = Seq(new Version("1.0.0"))

  override val controllers = Seq(
    "/*" -> new DarkBucketController()
  )

  override val assetsMappings = Seq("/darkbucket" -> "darkbucket/assets")

  override def javaScripts(registry: PluginRegistry, context: ServletContext, settings: SystemSettings): Seq[(String, String)] = {
    val path = settings.baseUrl.getOrElse(context.getContextPath)
    Seq(".*/.*" -> s"""
      var base_path = "$path";
    </script>
    <script src="$path/plugin-assets/darkbucket/darkmode.js"></script>
    <script>
    """)
  }


}
