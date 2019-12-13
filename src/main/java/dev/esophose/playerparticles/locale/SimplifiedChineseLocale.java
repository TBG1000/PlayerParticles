package dev.esophose.playerparticles.locale;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimplifiedChineseLocale implements Locale {

    @Override
    public String getLocaleName() {
        return "zh_CN";
    }

    @Override
    public String getTranslatorName() {
        return "qsefthuopq";
    }

    @Override
    public Map<String, String> getDefaultLocaleStrings() {
        return new LinkedHashMap<String, String>() {{
            // Plugin Prefix
            this.put("prefix", "&7[&3PlayerParticles&7] ");

            // 指令出错
            this.put("command-error-no-effects", "&c你必须有权限使用特效才能使用这个指令!");
            this.put("command-error-unknown", "&c未知的指令， 请使用 &b/pp help &c查看指令列表。");

            // Command Descriptions
            this.put("command-descriptions", "&e你可以使用以下指令:");
            this.put("command-descriptions-usage", "&e/pp %cmd% %args%");
            this.put("command-descriptions-help-1", "&7> &b/pp %cmd% &e- %desc%");
            this.put("command-descriptions-help-2", "&7> &b/pp %cmd% %args% &e- %desc%");
            this.put("command-descriptions-help-other", "&7> &b/ppo <player> <command> &e- 以玩家身份输入 /pp ");
            this.put("command-description-add", "添加新的粒子特效");
            this.put("command-description-data", "查看粒子特效使用的数据");
            this.put("command-description-default", "主指令，默认打开菜单");
            this.put("command-description-edit", "编辑粒子");
            this.put("command-description-effects", "显示你可以使用的粒子效果");
            this.put("command-description-fixed", "管理你的定点特效");
            this.put("command-description-group", "管理你的特效组");
            this.put("command-description-gui", "打开粒子特效编辑菜单");
            this.put("command-description-help", "显示帮助... 就是这里");
            this.put("command-description-info", "查看你使用的粒子特效的描述");
            this.put("command-description-list", "你使用的粒子特效的id");
            this.put("command-description-reload", "重载配置和语言文件");
            this.put("command-description-remove", "删除一些粒子特效");
            this.put("command-description-reset", "删除你身上所有特效");
            this.put("command-description-styles", "显示你可以使用的粒子风格");
            this.put("command-description-toggle", "开启或关闭粒子效果显示");
            this.put("command-description-version", "显示插件版本和作者");
            this.put("command-description-worlds", "查看禁用粒子特效的世界");

            // 子指令用法
            this.put("command-description-fixed-create", "&e/pp fixed create <<x> <y> <z>|<looking>> <特效名> <风格名> [数据名] - 创建新的定点特效");
            this.put("command-description-fixed-edit", "&e/pp fixed edit <id> <特效名|风格名|数据名> <参数> - 根据ID编辑定点特效");
            this.put("command-description-fixed-remove", "&e/pp fixed remove <ID> - 根据ID删除定点特效");
            this.put("command-description-fixed-list", "&e/pp fixed list - 列出所有定点特效的ID");
            this.put("command-description-fixed-info", "&e/pp fixed info <ID> - 获取定点特效的详细信息");
            this.put("command-description-fixed-clear", "&e/pp fixed clear <半径> - 清空指定范围内的所有定点特效");
            this.put("command-description-group-save", "&e/pp group save <组名> - 保存所有你使用的特效到新的组内");
            this.put("command-description-group-load", "&e/pp group load <组名> - 加载所有你保存组内的特效");
            this.put("command-description-group-remove", "&e/pp group remove <组名> - 删除一组你保存的特效");
            this.put("command-description-group-list", "&e/pp group list <组名> - 列出所有你保存的特效组");
            this.put("command-description-group-info", "&e/pp group info <组名> - 列出组内的特效信息");

            // 查询ID指令
            this.put("id-invalid", "&c你输入的ID无效， 必须是正整数!");
            this.put("id-unknown", "&c你没有ID为&b%id%&c的特效!");

            // 其他指令
            this.put("other-no-permission", "&c你没有权限对其他玩家使用PlayerParticles的指令!");
            this.put("other-missing-args", "&c缺少参数。 &b/ppo <player> <command>");
            this.put("other-unknown-player", "&c找不到玩家&b%player%&c。玩家必须在线。");
            this.put("other-unknown-command", "&c指令&b/pp %cmd% &c不存在。");
            this.put("other-success", "&e已为&b%player%&e执行指令 /pp 。 输出:");

            // 添加指令
            this.put("add-reached-max", "&c无法使用粒子效果，你已达到上限:&b%amount%&c!");
            this.put("add-particle-applied", "&a成功添加新的粒子特效： &b%effect%&a， 风格： &b%style%&a，数据： &b%data%&a!");

            // 数据指令
            this.put("data-no-args", "&c该特效缺失参数! 指令用法: &b/pp data <effect>");

            // 编辑指令
            this.put("edit-invalid-property", "&c您输入的参数&b%prop%&c无效。 有效参数为: &beffect&c， &bstyle&c， &bdata");
            this.put("edit-success-effect", "&aID为&b%id%&a的粒子的特效已更改为&b%effect%&a!");
            this.put("edit-success-style", "&aID为&b%id%&a的粒子的风格已更改为&b%style%&a!");
            this.put("edit-success-data", "&aID为&b%id%&a的粒子的数据已更改为&b%data%&a!");

            // 粒子组指令
            this.put("group-invalid", "&c名为&b%name%&c的粒子组不存在!");
            this.put("group-no-permission", "&c你没有使用&b%group%&c的权限!");
            this.put("group-preset-no-permission", "&c你没有使用预设粒子组&b%group%&c的权限!");
            this.put("group-reserved", "&c该组名&b&c无法使用!");
            this.put("group-no-name", "&c你没有输入组名! &b/pp %cmd% <组名>");
            this.put("group-save-reached-max", "&c无法保存粒子组，你已达到可使用粒子组的上限!");
            this.put("group-save-no-particles", "&c无法保存粒子组，你没有添加任何粒子!");
            this.put("group-save-success", "&a你当前使用的粒子特效已成功保存入粒子组&b%name%&a内!");
            this.put("group-save-success-overwrite", "&a已将你当前使用的粒子特效加入到粒子组&b%name%&a内!");
            this.put("group-load-success", "&a已将&b%amount%&a个粒子特效加入你已保存的粒子组&b%name%&a内!");
            this.put("group-load-preset-success", "&a已使用&b%name%&a预设组内的&b%amount%&a个粒子特效!");
            this.put("group-remove-preset", "&c你无法删除预设粒子组!");
            this.put("group-remove-success", "&a成功删除粒子组&b%name%&a!");
            this.put("group-info-header", "&e粒子组&b%group%&e拥有以下粒子特效:");
            this.put("group-list-none", "&e你没有保存任何粒子组!");
            this.put("group-list-output", "&e你已成功保存以下粒子组: &b%info%");
            this.put("group-list-presets", "&e可使用以下预设粒子组: &b%info%");

            // 重载指令
            this.put("reload-success", "&a插件已重载!");
            this.put("reload-no-permission", "&c你没有重载插件配置的指令!");

            // 删除指令
            this.put("remove-no-args", "&c你没有指定要删除的ID! &b/pp remove <ID>");
            this.put("remove-id-success", "&a你已成功删除ID为&b%id%&a的粒子特效!");
            this.put("remove-effect-success", "&a成功删除&b%amount%&a个&b%effect%&a特效的粒子!");
            this.put("remove-effect-none", "&c你没有使用特效&b%effect%&c的粒子!");
            this.put("remove-style-success", "&已成功删除&b%amount%&a个使用了风格&b%style%&a的粒子!");
            this.put("remove-style-none", "&c你没有已使用风格&b%style%&c的粒子!");
            this.put("remove-unknown", "&c名为&b%name%&c的特效或风格不存在!");

            // 列白指令
            this.put("list-none", "&e你没有任何激活的特效!");
            this.put("list-you-have", "&e你使用了以下粒子特效:");
            this.put("list-output", "&eID: &b%id% &e特效: &b%effect% &e风格: &b%style% &e数据: &b%data%");

            // 开关指令
            this.put("toggle-on", "&e粒子特效已&a开启&e!");
            this.put("toggle-off", "&e粒子特效已&c关闭&e!");

            // 彩虹
            this.put("rainbow", "&c彩&6虹");

            // 随机
            this.put("random", "随机");

            // 特效
            this.put("effect-no-permission", "&c你没有使用特效&b%effect%的权限&c!");
            this.put("effect-invalid", "&c特效&b%effect% &c不存在! 请输入&b/pp effects &c查看你可以使用的特效。");
            this.put("effect-list", "&e你可以使用以下特效: &b%effects%");
            this.put("effect-list-empty", "&c你没有使用任何特效的权限!");

            // 风格
            this.put("style-no-permission", "&c你没有权限使用&b%style%这一风格&c!");
            this.put("style-event-spawning-info", "&e提醒: 风格&b%style%&e基于事件生成。");
            this.put("style-invalid", "&c风格&b%style%&c不存在! 请输入&b/pp styles &c查看你可以使用的风格。");
            this.put("style-list", "&e你可以使用以下风格: &b%styles%");

            // 数据
            this.put("data-usage-none", "&e粒子特效&b%effect%&e不使用任何数据!");
            this.put("data-usage-block", "&e粒子特效&b%effect%&e需要设置&b方块&e数据! &b格式: <方块ID>");
            this.put("data-usage-item", "&e粒子特效&b%effect%&e需要设置&b物品&e数据! &b格式: <物品ID>");
            this.put("data-usage-color", "&e粒子特效&b%effect%&e需要设置&b颜色&e数据! &b格式: <<0-255> <0-255> <0-255>>|<rainbow>|<random>");
            this.put("data-usage-note", "&e粒子特效&b%effect%&e需要设置&b音符&e数据! &b格式: <0-24>|<rainbow>|<random>");
            this.put("data-invalid-block", "&c你输入的&b方块&c数据 无效! &b格式: <方块ID>");
            this.put("data-invalid-item", "&c你输入的&b物品&c数据 无效! &b格式: <物品ID>");
            this.put("data-invalid-color", "&c你输入的&b颜色&c数据 无效! &b格式: <<0-255> <0-255> <0-255>>|<rainbow>|<random>");
            this.put("data-invalid-note", "&c你输入的&b音符&c数据 无效! &b格式: <0-24>|<rainbow>|<random>");
            this.put("data-invalid-material-not-item", "&c你输入的&b物品&c材料名 &b%material%&c不是一件物品!");
            this.put("data-invalid-material-not-block", "&c你输入的&b方块&c材料名&b%material%&c不是一个方块!");
            this.put("data-invalid-material-item", "&c你输入的&b物品&c材料&b%material%不存在!");
            this.put("data-invalid-material-block", "&c你输入的&b方块&c材料&b%material%!");

            // 世界
            this.put("disabled-worlds", "&e这些世界禁用粒子特效: &b%worlds%");
            this.put("disabled-worlds-none", "&e所有世界都禁用粒子特效。");

            // 删除
            this.put("reset-success", "&a已删除&b%amount%个&a激活的粒子特效!");

            // 定点特效
            this.put("fixed-create-missing-args", "&c无法创建定点特效， 缺少 &b%amount% &c必要参数!");
            this.put("fixed-create-invalid-coords", "&c无法创建定点特效， 你输入的坐标无效!");
            this.put("fixed-create-out-of-range", "&c无法创建定点特效，你必须在目标地点&b%range%&c格内!");
            this.put("fixed-create-looking-too-far", "&c无法创建定点特效， 你离目标方块太远了!");
            this.put("fixed-create-effect-invalid", "&c无法创建定点特效，名为&b%effect%&c的特效不存在!");
            this.put("fixed-create-effect-no-permission", "&c无法创建定点特效， 你没有权限使用特效&b%effect%&c!");
            this.put("fixed-create-style-invalid", "&c无法创建定点特效， 名为&b%style%&c的风格不存在!");
            this.put("fixed-create-style-no-permission", "&c无法创建定点特效， 你没有权限使用风格&b%style%&c!");
            this.put("fixed-create-style-non-fixable", "&c无法创建定点特效， 风格&b%style%&c无法用于定点特效!");
            this.put("fixed-create-data-error", "&c无法创建定点特效， 你所给出的数据有误! 请输入 &b/pp data <effect> &c查看正确的数据格式!");
            this.put("fixed-create-success", "&a成功创建定点特效!");

            this.put("fixed-edit-missing-args", "&c无法编辑定点特效， 缺失参数!");
            this.put("fixed-edit-invalid-id", "&c无法编辑定点特效， ID无效或不存在!");
            this.put("fixed-edit-invalid-property", "&c无法编辑定点特效， 参数无效! 只有&blocation&c、&beffect&c、&bstyle&c和&bdata &c才有效。");
            this.put("fixed-edit-invalid-coords", "&c无法编辑定点特效， 你输入的一个或多个坐标无效!");
            this.put("fixed-edit-out-of-range", "&c无法编辑定点特效，你必须在目标地点&b%range%&c格内才能进行编辑!");
            this.put("fixed-edit-looking-too-far", "&c无法编辑定点特效， 你离目标地点太远了!");
            this.put("fixed-edit-effect-invalid", "&c无法编辑定点特效， 名为&b%effect%&c的特效不存在!");
            this.put("fixed-edit-effect-no-permission", "&c无法编辑定点特效， 你没有权限使用特效&b%effect%&c!");
            this.put("fixed-edit-style-invalid", "&c无法编辑定点特效， 名为&b%style%&c的风格不存在!");
            this.put("fixed-edit-style-no-permission", "&c无法编辑定点特效， 你没有权限使用风格&b%style%&c!");
            this.put("fixed-edit-style-non-fixable", "&c无法编辑定点特效， 风格 &b%style% &c无法用于定点特效!");
            this.put("fixed-edit-data-error", "&c无法编辑定点特效， 数据有误! 请输入 &b/pp data <effect> &cto 来获取正确的数据格式!");
            this.put("fixed-edit-data-none", "&c无法编辑定点特效， 该特效无需数据!");
            this.put("fixed-edit-success", "&a已更新&b%prop%&a个ID为&b%id%&a的定点特效!");

            this.put("fixed-remove-invalid", "&c无法删除定点特效， 你没有ID为&b%id%&c的定点特效!");
            this.put("fixed-remove-no-args", "&c你没有指定要删除的ID!");
            this.put("fixed-remove-args-invalid", "&c无法删除，ID必须是数字!");
            this.put("fixed-remove-success", "&a已删除ID为&b%id%&a的定点特效!");

            this.put("fixed-list-none", "&e你没有定点特效!");
            this.put("fixed-list-success", "&e你的定点特效ID为: &b%ids%");

            this.put("fixed-info-invalid", "&c无法获取信息， 你没有ID为&b%id%&c的定点特效!");
            this.put("fixed-info-no-args", "&c你未指定ID!");
            this.put("fixed-info-invalid-args", "&c无法获取信息， ID必须是数字!");
            this.put("fixed-info-success", "&eID: &b%id% &e世界: &b%world% &eX: &b%x% &eY: &b%y% &eZ: &b%z% &e特效: &b%effect% &e风格: &b%style% &e数据: &b%data%");

            this.put("fixed-clear-no-permission", "&c你没有清空附近定点特效的权限!");
            this.put("fixed-clear-no-args", "&c你没有给出清空定点特效的范围!");
            this.put("fixed-clear-invalid-args", "&c你输入的范围无效，范围必须是正整数!");
            this.put("fixed-clear-success", "&a已清除&b%amount%&a个&b%range%&a格内的定点特效!");

            this.put("fixed-no-permission", "&c你没有使用定点特效的权限!");
            this.put("fixed-max-reached", "&c你已达到可使用定点特效的数量上限!");
            this.put("fixed-invalid-command", "&c你输入了无效的子指令!");

            // 更新提醒
            this.put("update-available", "&e有新版本更新：(&b%new%&e)!你使用的版本为&bv%current%&e。 https://songoda.com/marketplace/product/32");

            // GUI
            this.put("gui-disabled", "&c服务器管理员已关闭菜单!");
            this.put("gui-color-icon-name", "&a");
            this.put("gui-color-info", "&e");
            this.put("gui-color-subtext", "&b");
            this.put("gui-color-unavailable", "&c");
            this.put("gui-commands-info", "商人 &b/pp help 查看指令帮助");
            this.put("gui-back-button", "返回");
            this.put("gui-next-page-button", "下一页 (%start%/%end%)");
            this.put("gui-previous-page-button", "上一页 (%start%/%end%)");
            this.put("gui-click-to-load", "点击加载%amount% 个粒子特效:");
            this.put("gui-shift-click-to-delete", "Shift+点击 删除");
            this.put("gui-particle-info", "  - ID: &b%id% &e特效: &b%effect% &e风格: &b%style% &e数据: &b%data%");
            this.put("gui-playerparticles", "粒子特效");
            this.put("gui-active-particles", "激活的粒子: &b%amount%");
            this.put("gui-saved-groups", "已保存的粒子组: &b%amount%");
            this.put("gui-fixed-effects", "定点特效: &b%amount%");
            this.put("gui-edit-primary-effect", "编辑之前使用的粒子的特效");
            this.put("gui-edit-primary-effect-description", "编辑之前使用的粒子的特效");
            this.put("gui-edit-primary-style", "编辑之前使用粒子的风格");
            this.put("gui-edit-primary-style-missing-effect", "你必须先选择一个特效");
            this.put("gui-edit-primary-style-description", "编辑之前使用粒子的风格");
            this.put("gui-edit-primary-data", "编辑之前使用粒子的数据");
            this.put("gui-edit-primary-data-missing-effect", "你必须先选择一个特效");
            this.put("gui-edit-primary-data-unavailable", "你之前使用的特效没有使用任何数据");
            this.put("gui-edit-primary-data-description", "编辑之前使用的特效的数据");
            this.put("gui-manage-your-particles", "管理你的粒子特效");
            this.put("gui-manage-your-particles-description", "创建、编辑和删除你的粒子特效");
            this.put("gui-manage-your-groups", "管理你的特效组");
            this.put("gui-manage-your-groups-description", "创建、删除和加载你的粒子组");
            this.put("gui-load-a-preset-group", "加载预设粒子组");
            this.put("gui-load-a-preset-group-description", "加载预设粒子组");
            this.put("gui-save-group", "保存新的粒子组");
            this.put("gui-save-group-description", "点击保存为新的粒子组。你需要\n在聊天框内输入名称。");
            this.put("gui-save-group-full", "你已达到粒子组上限");
            this.put("gui-save-group-no-particles", "你没有使用粒子特效");
            this.put("gui-save-group-hotbar-message", "&e请在聊天框内输入&b1 &e新的粒子组名。 输入 &ccancel&e 取消。 (剩余&b%seconds%&e秒)");
            this.put("gui-reset-particles", "重置你的粒子特效");
            this.put("gui-reset-particles-description", "删除你激活的所有粒子特效");
            this.put("gui-particle-name", "粒子 #%id%");
            this.put("gui-click-to-edit-particle", "点击编辑粒子特效、风格或数据");
            this.put("gui-editing-particle", "编辑粒子#%id%中");
            this.put("gui-edit-effect", "编辑特效");
            this.put("gui-edit-effect-description", "点击编辑粒子特效");
            this.put("gui-edit-style", "编辑风格");
            this.put("gui-edit-style-description", "点击编辑粒子风格");
            this.put("gui-edit-data", "编辑数据");
            this.put("gui-edit-data-description", "点击编辑粒子数据");
            this.put("gui-edit-data-unavailable", "这个粒子特效不使用数据");
            this.put("gui-data-none", "无");
            this.put("gui-create-particle", "创建新的粒子特效");
            this.put("gui-create-particle-description", "创建新的粒子特效");
            this.put("gui-create-particle-unavailable", "你不能创建更多的粒子特效");
            this.put("gui-select-effect", "选择粒子特效");
            this.put("gui-select-effect-description", "将粒子特效设置为 &b%effect%");
            this.put("gui-select-style", "选择粒子风格");
            this.put("gui-select-style-description", "将粒子风格设置为 &b%style%");
            this.put("gui-select-data", "选择粒子数据");
            this.put("gui-select-data-description", "将粒子数据设置为&b%data%");
            this.put("gui-select-data-note", "note #%note%");
            this.put("gui-edit-data-color-red", "&c红色");
            this.put("gui-edit-data-color-orange", "&6橙黄");
            this.put("gui-edit-data-color-yellow", "&e黄色");
            this.put("gui-edit-data-color-lime-green", "&a淡绿");
            this.put("gui-edit-data-color-green", "&2绿色");
            this.put("gui-edit-data-color-blue", "&1蓝色");
            this.put("gui-edit-data-color-cyan", "&3青色");
            this.put("gui-edit-data-color-light-blue", "&b淡蓝色");
            this.put("gui-edit-data-color-purple", "&5紫色");
            this.put("gui-edit-data-color-magenta", "&d洋红");
            this.put("gui-edit-data-color-pink", "&d粉色");
            this.put("gui-edit-data-color-brown", "&6棕色");
            this.put("gui-edit-data-color-black", "&8黑色");
            this.put("gui-edit-data-color-gray", "&8灰色");
            this.put("gui-edit-data-color-light-gray", "&7淡灰");
            this.put("gui-edit-data-color-white", "&f白色");
        }};
    }

}
