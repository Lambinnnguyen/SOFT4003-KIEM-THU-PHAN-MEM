describe('Checkout Test', () => {
  beforeEach(() => {
    cy.visit('https://www.saucedemo.com');
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
  });

  it('Should complete the checkout process', () => {
    // Add product to cart
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    cy.get('.shopping_cart_badge').should('have.text', '1');

    // Go to cart
    cy.get('.shopping_cart_link').click();

    // Proceed to checkout
    cy.get('#checkout').click();

    // Fill checkout information
    cy.get('#first-name').type('John');
    cy.get('#last-name').type('Doe');
    cy.get('#postal-code').type('12345');
    cy.get('#continue').click();

    // Verify navigation to checkout step two
    cy.url().should('include', '/checkout-step-two.html');
  });
});