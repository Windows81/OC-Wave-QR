package org.apache.oltu.oauth2.common.validators;

import javax.servlet.http.HttpServletRequest;

public abstract class AbstractValidator<T extends HttpServletRequest> implements OAuthValidator<T> {
}
