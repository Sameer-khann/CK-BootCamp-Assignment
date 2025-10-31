// Constructor function
function Product(name, price, category) {
    this.name = name;
    this.price = price;
    this.category = category;
}

Product.prototype.getDiscountedPrice = function (percent) {
    return this.price - (this.price * percent / 100);
};

// IIFE
var products;

(function () {
    products = [
        new Product('Apple MacBook', 1200, 'Electronics'),
        new Product('Nike Sneakers', 130, 'Footwear'),
        new Product('Range Rover', 23100000, 'Automobile'),
        new Product('Turbo Racing Toy Car', 1999, 'Toy')
    ];

    var priceList = products.map(function (p) { return p.price; });

    function findMax() {
        var max = -Infinity;
        for (var i = 0; i < arguments.length; i++) {
            if (arguments[i] > max) {
                max = arguments[i];
            }
        }
        return max;
    }


    var maxPrice = findMax.apply(null, priceList);

    // Div 1
    var topDiv = document.getElementById('costliest-price');
    topDiv.textContent = "Price of costliest product is " + maxPrice;

    // Div 2
    var listDiv = document.getElementById('product-list');
    for (var i = 0; i < products.length; i++) {
        var product = products[i];

        var card = document.createElement('div');
        card.className = "card";

        var title = document.createElement('div');
        title.className = "card-title";
        title.textContent = product.name;
        card.appendChild(title);

        var category = document.createElement('div');
        category.className = "card-category";
        category.textContent = product.category;
        card.appendChild(category);

        var price = document.createElement('div');
        price.className = "card-price";
        price.textContent = "₹" + product.price;
        card.appendChild(price);

        var discount = document.createElement('div');
        discount.className = "card-discount";
        var discountValue = product.getDiscountedPrice(10);
        discount.textContent = "10% Off: ₹" + discountValue.toFixed(2);
        card.appendChild(discount);

        card.addEventListener('mouseenter', function () {
            this.style.background = '#ffe066';
        });
        card.addEventListener('mouseleave', function () {
            this.style.background = '#fff';
        });

        listDiv.appendChild(card);
    }
})();
