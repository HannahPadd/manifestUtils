import ManifestUtils.Companion.getVersionTags
import kotlin.test.Test

class LibraryTest {

    @Test
    fun testGetChannels() {
        val manifestPath = "update-manifest.json"
        val manifest = Manifest(manifestPath).getManifest()
    }

    @Test
    fun testGetVersionTags() {
        val manifestPath = "update-manifest.json"
        val manifest = Manifest(manifestPath).getManifest()
        val stableVersionTags = getVersionTags(manifest, "stable")
        println(stableVersionTags)
    }
}