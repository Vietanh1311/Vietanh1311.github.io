// Random id
function randomId() {
    return Math.floor(Math.random() * 100000);
}

// Convert price
function convertPrice(number) {
    return number.toLocaleString("it-IT", {
        style: "currency",
        currency: "VND",
    });
}

// Khai báo danh sách sản phẩm
let products = [
    {
        id: randomId(),
        name: "Áo kiểu nữ cam đất phối cổ trắng dập ly",
        description:
            "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quae, velit.",
        price: 250000,
        image: "https://image.yes24.vn/Upload/ProductImage/anhduong201605/1947415_L.jpg?width=550&height=550",
        count: 1,
    },
    {
        id: randomId(),
        name: "Áo trắng bèo lé đen tay loe dễ thương",
        description:
            "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quae, velit.",
        price: 350000,
        image: "https://image.yes24.vn/Upload/ProductImage/anhduong201605/1914666_L.jpg?width=550&height=550",
        count: 3,
    },
];


// Khai báo biến
const productsEle = document.querySelector(".products");

const subTotalEl = document.querySelector(".subtotal span");
const vatEl = document.querySelector(".vat span");
const totalEl = document.querySelector(".total span");

// Render và hiển thị dữ liệu
function renderProduct(arr) {
    productsEle.innerHTML = "";

    // Cập nhật số lượng sản phẩm trong giỏ hàng
    let countEl = document.querySelector(".count");
    countEl.innerText = `${updateTotalProduct(arr)} items in the bag`;

    // Tính tổng tiền
    updateTotalMoney(arr)

    // Trường hợp giỏ hàng rỗng (products = [])
    if (arr.length == 0) {
        productsEle.insertAdjacentHTML(
            "afterbegin",
            "<li>Không có sản phẩm nào trong giỏ hàng</li>"
        );
        document.querySelector(".option-container").style.display = "none";
        return;
    }

    for (let i = 0; i < arr.length; i++) {
        const p = arr[i];

        productsEle.innerHTML += `
            <li class="row">
                <div class="col left">
                    <div class="thumbnail">
                        <a href="#">
                            <img
                                src="${p.image}"
                                alt="${p.name}"
                            />
                        </a>
                    </div>
                    <div class="detail">
                        <div class="name">
                            <a href="#">${p.name}</a>
                        </div>
                        <div class="description">
                            ${p.description}
                        </div>
                        <div class="price">${convertPrice(p.price)}</div>
                    </div>
                </div>

                <div class="col right">
                    <div class="quantity">
                        <input
                            type="number"
                            class="quantity"
                            step="1"
                            value="${p.count}"
                            onchange="changeTotalProduct(${p.id}, event)"
                        />
                    </div>

                    <div class="remove">
                        <span class="close" onclick="removeProduct(${p.id})">
                            <i class="fa fa-times"aria-hidden="true"></i>
                        </span>
                    </div>
                </div>
            </li>
        `;
    }
}

// Cập nhật số lượng sản phẩm
function updateTotalProduct(arr) {
    let total = 0;
    for (let i = 0; i < arr.length; i++) {
        total += arr[i].count;
    }
    return total;
}

// Xóa sản phẩm
function removeProduct(id) {
    for (let i = 0; i < products.length; i++) {
        if (products[i].id == id) {
            // Thực hiện xóa products[i] ra khỏi mảng products
            products.splice(i, 1);
        }
    }
    renderProduct(products);
}

// Thay đổi số lượng sản phẩm
function changeTotalProduct(id, event) {
    for (let i = 0; i < products.length; i++) {
        if (products[i].id == id) {
            products[i].count = Number(event.target.value);
        }
    }
    renderProduct(products);
}

// Cập nhật tổng tiền
function updateTotalMoney(arr) {
    let totalMoney = 0;

    for (let i = 0; i < arr.length; i++) {
        totalMoney += arr[i].count * arr[i].price;
    }

    subTotalEl.innerText = convertPrice(totalMoney);
    vatEl.innerText = convertPrice(totalMoney * 0.05);
    totalEl.innerText = convertPrice(totalMoney * 1.05);
}
// Danh sách mã giảm giá
let promotionCode = {
    A: 100,
    B: 50,
    C: 40,
    D: 25,
};

const container = document.querySelector(".container");
const titleEl = container.querySelector("h1");
titleEl.innerText = "Giỏ hàng";

const promotionEl = document.querySelector(".promotion");
const promoCode = document.querySelector("#promo-code");
const promoCodeBtn = promotionEl.querySelector("button");
const discountEl = document.querySelector(".discount");

promoCodeBtn.addEventListener("click", () => {
    if (Object.keys(promotionCode).includes(promoCode.value)) {
        discountEl.classList.remove("hide");
        discountEl.querySelector("span").innerText = `${
            promotionCode[promoCode.value]
        }%`;

        let numberTotal = parseFloat(
            totalEl.innerText.slice(0, totalEl.innerText.indexOf("USD") - 1)
        );

        totalEl.innerText = convertPrice(
            numberTotal - numberTotal * (promotionCode[promoCode.value] / 100)
        );

        delete promotionCode[`${promoCode.value}`];
        console.log("🚀 ~ promotionCode", promotionCode);
    }
});

window.onload = renderProduct(products);
