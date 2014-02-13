class UrlMappings {

  static mappings = {
    "/$mockupName" (controller: 'mockup', action: 'index')
    "/${mockupName}.jpeg" (controller: 'mockup', action: 'image')
    "/${mockupName}.bmml" (controller: 'mockup', action: 'bmml')
    "/$controller/$action?/$id?(.$format)?" {
      constraints {
        // apply constraints here
      }
    }

    "/"(view: "/index")
    "500"(view: '/error')
  }
}
