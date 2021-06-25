# Overview

<div style="text-align: center">

[![Build Status](https://travis-ci.com/astrapi69/silk-icon-theme.svg?branch=main)](https://travis-ci.com/astrapi69/silk-icon-theme)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/silk-icon-theme.svg?style=flat)](https://github.com/astrapi69/silk-icon-theme/issues)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/silk-icon-theme/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/silk-icon-theme)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

</div>

Basic set of desktop icons for java swing or FX application. 

The original icons are from this [website](http://www.famfamfam.com/lab/icons/silk/) and designed from Mark James.

If you like this project put a ⭐ and donate

## Note

No animals were harmed in the making of this library.

# Donations

This project is kept as an open source product and relies on contributions to remain being
developed. If you like this library, please consider a donation

over paypal: <br><br>
<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=MJ7V43GU2H386" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" style="border: none" />
</a>
<br><br>
or over bitcoin(BTC) with this address:

bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy.png"
alt="Donation Bitcoin Wallet" width="250"/>

or over FIO with this address:

FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop.png"
alt="Donation FIO Wallet" width="250"/>

or over Ethereum(ETH) with:

0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D.png"
alt="Donation Ethereum Wallet" width="250"/>

or over Ethereum Classic(ETC) with:

0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD.png"
alt="Donation Ethereum Classic Wallet" width="250"/>

or over Dogecoin(DOGE) with:

D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1.png"
alt="Donation Dogecoin Wallet" width="250"/>

or over Monero(XMR) with:

49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw.png"
alt="Donation Monero Wallet" width="250"/>

## License

The source code comes under the Creative Commons Attribution 2.5 License, making silk-icon-theme great for all types of applications.

# Load icons 

You can load your icons in your application as follows:

```
    ImageIcon applicationAdd = ImageIconFactory
                             .newImageIcon("io/github/astrapi69/silk/icons/application_add.png");
	JButton btnApplicationAdd = IconButtonFactory.newIconButton(applicationAdd, "New application");
```

The classes ImageIconFactory and IconButtonFactory are helper classes that are defined in the test 
resources

# Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~silk-icon-theme~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core 
functionality of silk-icon-theme:

Than you can add the dependency to your dependencies:

	<properties>
			...
		<!-- silk-icon-theme version -->
		<silk-icon-theme.version>1</silk-icon-theme.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- silk-icon-theme DEPENDENCY -->
			<dependency>
				<groupId>io.github.astrapi69</groupId>
				<artifactId>silk-icon-theme</artifactId>
				<version>${silk-icon-theme.version}</version>
			</dependency>
			...
		</dependencies>

# gradle dependency

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of silk-icon-theme:

define version in file gradle.properties
```
silkIconThemeVersion=1
```

or in build.gradle ext area

```
ext {
			...
    silkIconThemeVersion = "1"
			...
}
```

and than add the dependency to the dependencies area

```
dependencies {
			...
    implementation("io.github.astrapi69:silk-icon-theme:$silkIconThemeVersion")
			...
}
```

# Semantic Versioning

The versions of silk-icon-theme are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

# Want to Help and improve it? #

The source code for silk-icon-theme are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/silk-icon-theme/fork](https://github.com/astrapi69/silk-icon-theme/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/silk-icon-theme/pull/new/develop).

Don't forget to add new units tests on your changes.

# Contacting the Developers

Do not hesitate to contact the silk-icon-theme developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/astrapi69/silk-icon-theme/issues).

# Credits

Special thanks to Mark James the origin creator of the icons
