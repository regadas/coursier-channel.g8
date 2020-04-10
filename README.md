# coursier-channel.g8

Ready to deploy coursier channel template

## Usage

```bash
sbt new regadas/coursier-channel.g8
```

## Github setup

Go to your repo *`settings`* > *`secrets`* and add:

* **GPG_SECRET**: This is your `gpg` private key encoded in `base64`. You can export yours with:
  
  `gpg --export-secret-keys <key> | base64 | pbcopy`

* **PGP_PASSPHRASE**: private key passphrase
* **SONATYPE_USERNAME**: sonatype username
* **SONATYPE_PASSOWRD**: sonatype password

## Release

Releasing your new channel is easy as:

```bash
git tag v0.1.0
```

```bash
git push -u origin v0.1.0
```
