package juzu.bestchoice;

import juzu.Path;
import juzu.View;
import juzu.Response;
import juzu.template.Template;

import javax.inject.Inject;
import java.io.IOException;

public class Controller {
  @Inject
  @Path("index.gtmpl")
  Template index;
  
  @Inject
  @Path("result.gtmpl")
  Template result;

  @Inject
  @Path("addNew.gtmpl")
  Template addNew;

  @Inject
  @Path("viewAllComments.gtmpl")
  Template viewAllComments;


  @View
  public Response.Content index() throws IOException {
    return index.ok();
  }
  
  @View
  public Response.Content result() throws IOException {
    return result.ok();
  }

  @View
  public Response.Content addNew() throws IOException {
    return addNew.ok();
  }

  @View
  public Response.Content viewAllComments() throws IOException {
    return viewAllComments.ok();
  }
}
