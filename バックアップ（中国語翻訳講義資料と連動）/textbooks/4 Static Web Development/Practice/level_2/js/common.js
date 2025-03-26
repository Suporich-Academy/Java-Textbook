$(function () {
    /*=================================================
    ハンバーガーメニュー
    ===================================================*/
    $('.hamburger').on('click', function () {
        // #headerにopenクラスが存在する場合
        if ($('#header').hasClass('open')) {
            // openクラスを削除
            // openクラスを削除すると、openクラスのCSSがはずれるため、
            // メニューが非表示になる
            $('#header').removeClass('open');

            // #headerにopenクラスが存在しない場合
        } else {
            // openクラスを追加
            // openクラスを追加すると、openクラスのCSSが適応されるため、
            // メニューが表示される
            $('#header').addClass('open');
        }
    });

    // #maskのエリアをクリックした時にメニューを閉じる
    $('#mask').on('click', function () {
        // openクラスを削除して、メニューを閉じる
        $('#header').removeClass('open');
    });

    // リンクをクリックした時にメニューを閉じる
    $('#navi a').on('click', function () {
        $('#header').removeClass('open');
    });

    /*=================================================
    トップに戻る
    ===================================================*/
    let pagetop = $('#to-top');
    // 最初に画面が表示された時は、トップに戻るボタンを非表示に設定
    pagetop.hide();

    // スクロールイベント（スクロールされた際に実行）
    $(window).scroll(function () {
        // スクロール位置が700pxを超えた場合
        if ($(this).scrollTop() > 700) {
            // トップに戻るボタンを表示する
            pagetop.fadeIn();

            // スクロール位置が700px未満の場合
        } else {
            // トップに戻るボタンを非表示にする
            pagetop.fadeOut();
        }
    });

    // クリックイベント（ボタンがクリックされた際に実行）
    pagetop.click(function () {
        // 0.5秒かけてページトップへ移動
        $('body,html').animate({ scrollTop: 0 }, 500);

        // イベントが親要素へ伝播しないための記述
        // ※詳しく知りたい方は「イベント　バブリング」または「jQuery バブリング」で調べてみてください
        return false;
    });
});