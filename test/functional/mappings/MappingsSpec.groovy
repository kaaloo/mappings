/*
 * Copyright Balsamiq Studios, Inc.  All rights reserved.  http://www.balsamiq.com
 *
 */

package mappings

import geb.spock.GebSpec

class MappingsSpec extends GebSpec {
  def "Mockup name without a dot works"() {
    setup:
    def mockupName = 'NoDotHere'

    when:
    go "/mappings/${mockupName}"

    then:
    page.text() == "This is the index page for mockup: ${mockupName}"

    when:
    go "/mappings/${mockupName}.jpeg"

    then:
    page.text() == "This is an image representing mockup: ${mockupName}"

    when:
    go "/mappings/${mockupName}.bmml"

    then:
    page.text() == "This is an xml format representing mockup: ${mockupName}"
  }

  def "Mockup name with a dot fails"() {
    setup:
    def mockupName = '3.1-ThisMockupNameHasADot'

    when:
    go "/mappings/${mockupName}"

    then:
    page.text() == "This is the index page for mockup: ${mockupName}"

    when:
    go "/mappings/${mockupName}.jpeg"

    then:
    page.text() == "This is an image representing mockup: ${mockupName}"

    when:
    go "/mappings/${mockupName}.bmml"

    then:
    page.text() == "This is an xml format representing mockup: ${mockupName}"
  }
}
