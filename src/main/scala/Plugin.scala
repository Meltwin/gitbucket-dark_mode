import gitbucket.core.controller.Context
import gitbucket.core.plugin.Link
import gitbucket.core.service.RepositoryService.RepositoryInfo
import io.github.gitbucket.solidbase.model.Version
import io.github.meltwin.darkbucket.controller.BugSpotsController

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "darkbucket"

  override val pluginName: String = "DarkBucket"

  override val description: String = "Dark Mode for GitBucket"

  override val versions: Seq[Version] = Seq(new Version("1.0.0"))

  override val controllers = Seq(
    "/*" -> new BugSpotsController
  )
}
