package org.interledger.spsp.client.model;

import java.net.URI;

import org.interledger.setup.spsp.model.Payee;

public class ClientPayee extends ClientReceiver implements Payee {

  private String name;
  private URI imageUri;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public URI getImageUrl() {
    return imageUri;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setImageUrl(URI imageUri) {
    this.imageUri = imageUri;
  }

}
