import util.enableSCSS

plugins {
  kotlin("multiplatform")
  id("convention.compose")
  id("convention.common")
}

kotlin {
  js {
    binaries.executable()
    // useCommonJs()
    enableSCSS(main = true, test = true)
    browser {}
  }
  sourceSets {
    jsMain {
      dependencies {
        implementation("dev.petuska:kmdc:0.0.5")
        implementation("dev.petuska:kmdcx:0.0.5")
      }
    }
  }
}
