package io.github.meltwin.darkbucket.controller

import gitbucket.core.controller.ControllerBase
import gitbucket.core.service.WikiService

import io.github.meltwin.darkbucket.html
import io.github.meltwin.darkbucket.util._
import gitbucket.core.account
import gitbucket.core.helper

class DarkBucketController extends ControllerBase {
  get("/#") (
    "Hello World!"
  )
}
 