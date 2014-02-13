package mappings

class MockupController {

  def index() {
    render "This is the index page for mockup: ${params.mockupName}"
  }

  def image() {
    render "This is an image representing mockup: ${params.mockupName}"
  }

  def bmml() {
    render "This is an xml format representing mockup: ${params.mockupName}"
  }
}
